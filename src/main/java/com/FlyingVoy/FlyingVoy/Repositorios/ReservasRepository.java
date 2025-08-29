package com.FlyingVoy.FlyingVoy.Repositorios;

import com.FlyingVoy.FlyingVoy.Entidades.ReservasEntity;
import com.FlyingVoy.FlyingVoy.Entidades.UsuariosEntity;
import com.FlyingVoy.FlyingVoy.Entidades.VuelosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface ReservasRepository extends JpaRepository<ReservasEntity, Long> {

    // Buscar reservas de un usuario
    List<ReservasEntity> findByUsuariosEntity(UsuariosEntity usuario);

    // Buscar reservas de un vuelo
    List<ReservasEntity> findByVuelosEntity(VuelosEntity vuelo);

    // Buscar reservas por fecha exacta
    List<ReservasEntity> findByFechaReserva(Date fechaReserva);

    // 🔹 Optimización: devolver solo la fecha de reserva por ID
    @Query("SELECT r.fechaReserva FROM ReservasEntity r WHERE r.idReserva = ?1")
    Optional<Date> findFechaReservaById(Long idReserva);

    // Buscar reservas de un usuario en un vuelo concreto
    @Query("SELECT r FROM ReservasEntity r WHERE r.usuariosEntity.id = ?1 AND r.vuelosEntity.id = ?2")
    Optional<ReservasEntity> findReservaByUsuarioAndVuelo(Long idUsuario, Long idVuelo);
}