package com.FlyingVoy.FlyingVoy.Servicios;

import com.FlyingVoy.FlyingVoy.DTO.VuelosDTO;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class VueloService {


    private WebClient webClient;



    //Flux devuelve un flujo de datos, 0 ... M
    public Flux<VuelosDTO> obtenerVuelos(){
            return webClient.get()
                    .uri("/flights")
                    .retrieve()
                    .bodyToFlux(VuelosDTO.class);
    }

    //Mono devuelce un unico dato, 0 ... 1
    public Mono<VuelosDTO> obtenerVueloCodigo(String Codigo){
        return webClient.get()
                .uri("/flights{codigo}")
                .retrieve()
                .bodyToMono(VuelosDTO.class);
    }

}
