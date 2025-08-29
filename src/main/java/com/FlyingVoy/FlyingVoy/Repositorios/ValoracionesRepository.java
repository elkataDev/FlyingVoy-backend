package com.FlyingVoy.FlyingVoy.Repositorios;

import com.FlyingVoy.FlyingVoy.Entidades.ValoracionesEntity;
import com.FlyingVoy.FlyingVoy.Entidades.UsuariosEntity;
import com.FlyingVoy.FlyingVoy.Entidades.VuelosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ValoracionesRepository extends JpaRepository<ValoracionesEntity,Long> {

    // Buscar todas las valoraciones de un usuario
    List<ValoracionesEntity> findByUsuariosEntity(UsuariosEntity usuario);

    // Buscar todas las valoraciones de un vuelo
    List<ValoracionesEntity> findByVuelosEntity(VuelosEntity vuelo);

    // Obtener puntuaciones (solo el campo) por vuelo
    @Query("SELECT v.puntuacion FROM ValoracionesEntity v WHERE v.vuelosEntity.id = ?1")
    List<Byte> findPuntuacionesByVuelo(Long idVuelo);

    // Obtener comentarios (solo el campo) por vuelo
    @Query("SELECT v.comentario FROM ValoracionesEntity v WHERE v.vuelosEntity.id = ?1")
    List<String> findComentariosByVuelo(Long idVuelo);

    // Buscar por puntuación exacta
    List<ValoracionesEntity> findByPuntuacion(byte puntuacion);

    // Buscar por puntuación mínima (mayor o igual)
    @Query("SELECT v FROM ValoracionesEntity v WHERE v.puntuacion >= ?1")
    List<ValoracionesEntity> findByPuntuacionMinima(byte puntuacionMin);
}
