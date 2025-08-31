package com.FlyingVoy.FlyingVoy.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;


/*
Clase que convierte el json dado por por la API en una clase de java,
Despues se mapea para obtener los datos necesarios para crear un DTO
 */
@Data
public class ApiRespuesta {
    private List<FlightData> data;
}





@Data
class Departure {
    private String airport;
    private String timezone;
    private String iata;
    private String icao;
    private String terminal;
    private String gate;
    private Integer delay;
    private String scheduled;
    private String estimated;
    private String actual;

    @JsonProperty("estimated_runway")
    private String estimatedRunway;

    @JsonProperty("actual_runway")
    private String actualRunway;
}

@Data
class Arrival {
    private String airport;
    private String timezone;
    private String iata;
    private String icao;
    private String terminal;
    private String gate;
    private String baggage;
    private String scheduled;
    private Integer delay;
    private String estimated;
    private String actual;

    @JsonProperty("estimated_runway")
    private String estimatedRunway;

    @JsonProperty("actual_runway")
    private String actualRunway;
}

@Data
class Airline {
    private String name;
    private String iata;
    private String icao;
}

@Data
class Flight {
    private String number;
    private String iata;
    private String icao;
    private Object codeshared; // puede ser otra clase si lo necesitas
}
