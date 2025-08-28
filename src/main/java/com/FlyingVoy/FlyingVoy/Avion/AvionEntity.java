package com.FlyingVoy.FlyingVoy.Avion;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.OffsetDateTime;

@Getter
@Setter
@Entity
@Table(name = "aviones")
public class AvionEntity {

    @Id
    @Column(name = "vuelo", nullable = false, unique = true)
    private String vuelo; // flight.number

    @Column(name = "modelo", nullable = false)
    private String modeloAvion; // aircraft.modelText

    @Column(name = "compania", nullable = false)
    private String compania; // airline.name

    @Column(name = "Fecha_Vuelo",nullable = false)
    private LocalDate fechaVuelo; //data.flight_date

    @Column(name = "codigo_Salida", nullable = false)
    private String salida; //departure.iataCode

    @Column(name = "codigo_Destino", nullable = false)
    private String destino; //arrival.iataCode

    @Column(name = "Hora_Programada_Salida", nullable = false)
    private OffsetDateTime horaProgramadaSalida; //departure.scheduledTime

    @Column(name = "Hora_Programada_Destino", nullable = false)
    private OffsetDateTime horaProgramadaDestino; //arrival.scheduledTime

    @Column(name = "Terminal_Salida", nullable = false)
    private int terminalSalida; //departure.terminal

    @Column(name = "Terminal_Destino", nullable = false)
    private int terminalDestino; //arrival.terminal

    @Column(name = "Aeropuerto_Salida",nullable = false)
    private String aeropuertoSalida; //departure.airport

    @Column(name = "Aeropuerto_Destino",nullable = false)
    private String aeropuertoDestino; //arrival.airport
}