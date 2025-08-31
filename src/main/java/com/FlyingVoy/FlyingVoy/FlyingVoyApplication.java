package com.FlyingVoy.FlyingVoy;

import com.FlyingVoy.FlyingVoy.Servicios.VueloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class FlyingVoyApplication {

    @Autowired
   static VueloService vueloService;

    public static void main(String[] args) {
        SpringApplication.run(FlyingVoyApplication.class, args);


    }

    /*
    Funcion que llama a la Api para implementar todo en la base de datos,
    comentada para no consumir las requests disponibles a la API
     */
/*
    @Bean
    CommandLineRunner init(VueloService vueloService) {
        return args -> {
            System.out.println("GUARDANDO VUELOS EN LA BD");
            vueloService.sincronizarVuelosAPI()
                    .doOnNext(vuelo -> System.out.println("Vuelo guardado: " + vuelo.getId_Vuelo()))
                    .blockLast();
        };
    }

 */
}












