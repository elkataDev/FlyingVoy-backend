package com.FlyingVoy.FlyingVoy.Entidades;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Vuelos")
public class VuelosEntity {

    @Id
    @Column(name = "id_Vuelo", unique = true )
    private String id_Vuelo; // flight.number

    @Column(name = "modelo")
    private String modeloAvion; // aircraft.modelText

    @Column(name = "compania")
    private String compania; // airline.name

    @Column(name = "Fecha_Vuelo")
    private LocalDate fechaVuelo; //data.flight_date

    @Column(name = "codigo_Salida")
    private String salida; //departure.iataCode

    @Column(name = "codigo_Destino")
    private String destino; //arrival.iataCode

    @Column(name = "Terminal_Salida")
    private int terminalSalida; //departure.terminal

    @Column(name = "Terminal_Destino")
    private int terminalDestino; //arrival.terminal

    @Column(name = "Aeropuerto_Salida")
    private String aeropuertoSalida; //departure.airport

    @Column(name = "Aeropuerto_Destino")
    private String aeropuertoDestino; //arrival.airport

    @OneToMany(mappedBy = "vuelosEntity")
    private Set<ReservasEntity> reservasEntities = new HashSet<>();


}