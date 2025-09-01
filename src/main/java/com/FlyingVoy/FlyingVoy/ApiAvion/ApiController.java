package com.FlyingVoy.FlyingVoy.ApiAvion;


import com.FlyingVoy.FlyingVoy.DTO.FlightData;
import com.FlyingVoy.FlyingVoy.Servicios.VueloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ApiController {


    private VueloService vueloService;


    @GetMapping
    public Flux<FlightData> getVuelos(){
        return vueloService.obtenerVuelosAPI();
    }

    @GetMapping("/{codigo}")
    public Mono<FlightData> getVueloPorCodigo(@PathVariable String codigo){
        return vueloService.obtenerVueloCodigoAPI(codigo);
    }
}
