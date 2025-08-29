package com.FlyingVoy.FlyingVoy.Repositorios;

import com.FlyingVoy.FlyingVoy.Entidades.VuelosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface VueloRepository extends JpaRepository<VuelosEntity, Long> {

    // Búsqueda general por coincidencia parcial de compañía
    @Query("SELECT v FROM VuelosEntity v WHERE v.compania LIKE %?1%")
    List<VuelosEntity> buscarPorCompania(String keyword);

    // Buscar por ID del vuelo (el ID principal)
    Optional<VuelosEntity> findById(Long id_Vuelo);

    // Buscar vuelos por aeropuerto de salida o destino
    List<VuelosEntity> findByAeropuertoSalida(String aeropuertoSalida);

    List<VuelosEntity> findByAeropuertoDestino(String aeropuertoDestino);

    // Buscar vuelos por fecha
    List<VuelosEntity> findByFechaVuelo(LocalDate fechaVuelo);

    // Consultas optimizadas para devolver solo un campo
    @Query("SELECT v.fechaVuelo FROM VuelosEntity v WHERE v.id_Vuelo = ?1")
    Optional<LocalDate> findFechaVueloById(Long id_Vuelo);

    @Query("SELECT v.horaProgramadaSalida FROM VuelosEntity v WHERE v.id_Vuelo = ?1")
    Optional<OffsetDateTime> findHoraSalidaById(Long id_Vuelo);

    @Query("SELECT v.horaProgramadaDestino FROM VuelosEntity v WHERE v.id_Vuelo = ?1")
    Optional<OffsetDateTime> findHoraLlegadaById(Long id_Vuelo);

    @Query("SELECT v.compania FROM VuelosEntity v WHERE v.id_Vuelo = ?1")
    Optional<String> findCompaniaById(Long id_Vuelo);

    @Query("SELECT v.aeropuertoSalida FROM VuelosEntity v WHERE v.id_Vuelo = ?1")
    Optional<String> findAeropuertoSalidaById(Long id_Vuelo);

    @Query("SELECT v.aeropuertoDestino FROM VuelosEntity v WHERE v.id_Vuelo = ?1")
    Optional<String> findAeropuertoDestinoById(Long id_Vuelo);
}