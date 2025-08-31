package com.FlyingVoy.FlyingVoy.Servicios;

import com.FlyingVoy.FlyingVoy.DTO.ApiRespuesta;
import com.FlyingVoy.FlyingVoy.DTO.FlightData;
import com.FlyingVoy.FlyingVoy.DTO.VueloMapper;
import com.FlyingVoy.FlyingVoy.Entidades.VuelosEntity;
import com.FlyingVoy.FlyingVoy.Repositorios.VueloRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@Service
public class VueloService {


    private final WebClient webClient;
    private final VueloMapper vuelosMapper;
    private final VueloRepository vueloRepository;

    public VueloService(WebClient webClient,
                        VueloMapper vuelosMapper,
                        VueloRepository vueloRepository) {
        this.webClient = webClient;
        this.vuelosMapper = vuelosMapper;
        this.vueloRepository = vueloRepository;
    }

    //Flux devuelve un flujo de datos, 0 ... M
    public Flux<FlightData> obtenerVuelosAPI(){
            return this.webClient.get()
                    .uri("")
                    .retrieve()
                    .bodyToMono(ApiRespuesta.class)
                    .flatMapMany(api -> Flux.fromIterable(api.getData()));
    }

    //Mono devuelce un unico dato, 0 ... 1
    public Mono<FlightData> obtenerVueloCodigoAPI(String Codigo){
        return this.webClient.get()
                .uri(uriBuilder -> uriBuilder.queryParam("flight_iata", Codigo).build())
                .retrieve()
                .bodyToMono(ApiRespuesta.class)
                .flatMapMany(api -> Flux.fromIterable(api.getData()))
                .next();
    }


    //Mappear todos los vuelos a una entidad y guardarlo en la BD
    public Flux<VuelosEntity> sincronizarVuelosAPI(){
        return obtenerVuelosAPI()
                .map(vuelosMapper::toDTO)
                .map(vuelosMapper::toEntity)
                .flatMap(entity -> Mono.fromCallable(() -> vueloRepository.save(entity))
                        .subscribeOn(Schedulers.boundedElastic()));
    }

}
