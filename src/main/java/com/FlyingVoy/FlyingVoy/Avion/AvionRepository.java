package com.FlyingVoy.FlyingVoy.Avion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AvionRepository extends JpaRepository<AvionEntity, String> {

    // Buscar vuelos por compañía
    List<AvionEntity> findByCompania(String compania);

    // Buscar vuelos por fecha exacta
    List<AvionEntity> findByFechaVuelo(LocalDate fechaVuelo);

    // Buscar vuelos por código de salida
    List<AvionEntity> findBySalida(String salida);

    // Buscar vuelos por código de destino
    List<AvionEntity> findByDestino(String destino);

    // Buscar por compañía y fecha de vuelo
    List<AvionEntity> findByCompaniaAndVuelo(String compania, LocalDate fechaVuelo);

    //Buscar Vuelos entre dos fechas
    List<AvionEntity> findByFechaVueloBetween(LocalDate fechaInicio, LocalDate fechaFin);

    // Buscar vuelos por compañia ordenados por hora de salida Ascendente
    List<AvionEntity> findByCompaniaOrderByHoraProgramadaSalidaAsc(String compania);

    // Buscar vuelos por compañia ordenados por hora de salida Descendente
    List<AvionEntity> findByCompaniaOrderByHoraProgramadaSalidaDesc(String compania);

    // Buscar vuelos que salgan de un aeropuerto y llegen a otro
    List<AvionEntity> findBySalidaAndDestino(String salida, String destino);
}