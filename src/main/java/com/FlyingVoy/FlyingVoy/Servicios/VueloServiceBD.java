package com.FlyingVoy.FlyingVoy.Servicios;


import com.FlyingVoy.FlyingVoy.DTO.VueloMapper;
import com.FlyingVoy.FlyingVoy.DTO.VuelosDTO;
import com.FlyingVoy.FlyingVoy.Repositorios.VueloRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


/*
Servicio que se conecta a la BD y extrae todos los vuelos disponibles
 */
@Service
public class VueloServiceBD {


    private final VueloRepository vueloRepository;
    private final VueloMapper vueloMapper;

    public VueloServiceBD(VueloRepository vueloRepository, VueloMapper vueloMapper) {
        this.vueloRepository = vueloRepository;
        this.vueloMapper = vueloMapper;
    }


    //Devuelve todos los vuelos (entidades) y los mapea a DTO para ser recogidos por el front
    public Flux<VuelosDTO> obtenerVuelosBD(){
        return Flux.fromIterable(vueloRepository.findAll().stream().map(vueloMapper::entityToDTO).toList());
    }


    //Devuelve un solo vuelo
    public Mono<VuelosDTO> obtenerVueloID(String id_vuelo){
        return Mono.justOrEmpty(vueloRepository.findById(id_vuelo).map(vueloMapper::entityToDTO));
    }
}
