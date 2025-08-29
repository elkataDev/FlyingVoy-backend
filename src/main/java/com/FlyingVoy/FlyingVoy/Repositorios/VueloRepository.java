package com.FlyingVoy.FlyingVoy.Repositorios;

import com.FlyingVoy.FlyingVoy.Entidades.VuelosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VueloRepository extends JpaRepository<VuelosEntity, String> {
/*
    // Buscar vuelos por compañía
    List<VuelosEntity> findByCompania(String compania);

    // Buscar vuelos por fecha exacta
    List<VuelosEntity> findByFechaVuelo(LocalDate fechaVuelo);

    // Buscar vuelos por código de salida
    List<VuelosEntity> findBySalida(String salida);

    // Buscar vuelos por código de destino
    List<VuelosEntity> findByDestino(String destino);

    // Buscar por compañía y fecha de vuelo
    List<VuelosEntity> findByCompaniaAndVuelo(String compania, LocalDate fechaVuelo);

    //Buscar Vuelos entre dos fechas
    List<VuelosEntity> findByFechaVueloBetween(LocalDate fechaInicio, LocalDate fechaFin);

    // Buscar vuelos por compañia ordenados por hora de salida Ascendente
    List<VuelosEntity> findByCompaniaOrderByHoraProgramadaSalidaAsc(String compania);

    // Buscar vuelos por compañia ordenados por hora de salida Descendente
    List<VuelosEntity> findByCompaniaOrderByHoraProgramadaSalidaDesc(String compania);

    // Buscar vuelos que salgan de un aeropuerto y llegen a otro
    List<VuelosEntity> findBySalidaAndDestino(String salida, String destino);

 */
}