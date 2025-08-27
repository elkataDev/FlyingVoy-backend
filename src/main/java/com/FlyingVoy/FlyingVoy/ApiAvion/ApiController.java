package com.FlyingVoy.FlyingVoy.ApiAvion;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {


    private final ApiAvion apiAvion;



    public ApiController(ApiAvion apiAvion) {
        this.apiAvion = apiAvion;
    }

// Toma la variable @Path y le aniade el numero de vuelo, devuelve la informacion de todo el vuelo
    @GetMapping("/flights/{flightNumber}")
    public String getFlightInfo(@PathVariable String flightNumber) {


        if (flightNumber == null || flightNumber.isEmpty() ){
            return "KFSKNF";
        }

        return apiAvion.getFlights(flightNumber);
    }
}
