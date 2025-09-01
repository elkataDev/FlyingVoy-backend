package com.FlyingVoy.FlyingVoy.DTO;

import com.FlyingVoy.FlyingVoy.Entidades.VuelosEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@Component
public class VueloMapper {


    public VuelosDTO toDTO(FlightData flightData) {
        VuelosDTO dto = new VuelosDTO();

        dto.setIdVuelo(flightData.getFlight().getIata());

        dto.setModeloAvion(flightData.getAircraft() != null ? flightData.getAircraft().toString() : null);

        dto.setCompania(flightData.getAirline().getName());

        dto.setFechaVuelo(LocalDate.parse(flightData.getFlightDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd")));

        dto.setSalida(flightData.getDeparture().getIata());
        dto.setDestino(flightData.getArrival().getIata());


        dto.setTerminalSalida(flightData.getDeparture().getTerminal());
        dto.setTerminalDestino(flightData.getArrival().getTerminal());

        dto.setAeropuertoSalida(flightData.getDeparture().getAirport());
        dto.setAeropuertoDestino(flightData.getArrival().getAirport());

        return dto;
    }


    public VuelosEntity toEntity(VuelosDTO dto) {
        VuelosEntity vuelo = new VuelosEntity();
        vuelo.setId_Vuelo(dto.getIdVuelo());
        vuelo.setModeloAvion(dto.getModeloAvion());
        vuelo.setCompania(dto.getCompania());
        vuelo.setFechaVuelo(dto.getFechaVuelo());
        vuelo.setSalida(dto.getSalida());
        vuelo.setDestino(dto.getDestino());
        vuelo.setTerminalSalida(dto.getTerminalSalida());
        vuelo.setTerminalDestino(dto.getTerminalDestino());
        vuelo.setAeropuertoSalida(dto.getAeropuertoSalida());
        vuelo.setAeropuertoDestino(dto.getAeropuertoDestino());
        return vuelo;
    }


    public VuelosDTO entityToDTO(VuelosEntity vuelosEntity) {
        VuelosDTO dto = new VuelosDTO();

        dto.setIdVuelo(vuelosEntity.getId_Vuelo());
        dto.setModeloAvion(vuelosEntity.getModeloAvion());
        dto.setCompania(vuelosEntity.getCompania());
        dto.setFechaVuelo(vuelosEntity.getFechaVuelo());
        dto.setSalida(vuelosEntity.getSalida());
        dto.setDestino(vuelosEntity.getDestino());
        dto.setTerminalSalida(vuelosEntity.getTerminalSalida());
        dto.setTerminalDestino(vuelosEntity.getTerminalDestino());
        dto.setAeropuertoSalida(vuelosEntity.getAeropuertoSalida());
        dto.setAeropuertoDestino(vuelosEntity.getAeropuertoDestino());

        return dto;
    }
}