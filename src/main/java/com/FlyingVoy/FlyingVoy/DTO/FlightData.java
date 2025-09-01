package com.FlyingVoy.FlyingVoy.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FlightData {
    @JsonProperty("flight_date")
    private String flightDate;

    @JsonProperty("flight_status")
    private String flightStatus;

    private Departure departure;
    private Arrival arrival;
    private Airline airline;
    private Flight flight;
    private Object aircraft;
    private Object live;
}