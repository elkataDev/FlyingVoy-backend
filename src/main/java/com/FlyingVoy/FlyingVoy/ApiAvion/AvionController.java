package com.FlyingVoy.FlyingVoy.ApiAvion;

import com.FlyingVoy.FlyingVoy.DTO.VuelosDTO;
import com.FlyingVoy.FlyingVoy.Entidades.VuelosEntity;
import com.FlyingVoy.FlyingVoy.Servicios.VueloService;
import com.FlyingVoy.FlyingVoy.Servicios.VueloServiceBD;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;


//Controlador que recoge los datos de la Api y de la BD
@RestController
@RequestMapping("/api/vuelos")
@CrossOrigin(origins = "*")
public class AvionController {

    private final VueloService vueloService;
    private final VueloServiceBD vueloServiceBD;

    public AvionController(VueloService vueloService, VueloServiceBD vueloServiceBD) {
        this.vueloService = vueloService;
        this.vueloServiceBD = vueloServiceBD;
    }

    @PostMapping("/sync")
    public Flux<VuelosEntity> syncVuelos() {
        return vueloService.sincronizarVuelosAPI();
    }


    @GetMapping
    public Flux<VuelosDTO> obtenerVuelos(){

        return vueloServiceBD.obtenerVuelosBD();
    }
}
