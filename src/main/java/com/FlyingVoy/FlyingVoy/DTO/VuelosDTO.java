package com.FlyingVoy.FlyingVoy.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VuelosDTO {

    private String idVuelo;
    private String modeloAvion;
    private String compania;
    private LocalDate fechaVuelo;
    private String salida;
    private String destino;
    private OffsetDateTime horaProgramadaSalida;
    private OffsetDateTime horaProgramadaDestino;
    private int terminalSalida;
    private int terminalDestino;
    private String aeropuertoSalida;
    private String aeropuertoDestino;
}