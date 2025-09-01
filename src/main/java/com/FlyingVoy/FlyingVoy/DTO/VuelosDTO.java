package com.FlyingVoy.FlyingVoy.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

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
    private String terminalSalida;
    private String terminalDestino;
    private String aeropuertoSalida;
    private String aeropuertoDestino;
}