package com.FlyingVoy.FlyingVoy.Repositorios;

import com.FlyingVoy.FlyingVoy.Entidades.UsuariosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Optional;
import java.util.List;

@Repository
public interface UsuariosRepository extends JpaRepository<UsuariosEntity, Long> {

    // Buscar usuarios por coincidencia parcial en nombre
    @Query("SELECT u FROM UsuariosEntity u WHERE u.nombre LIKE %?1%")
    List<UsuariosEntity> buscarPorNombre(String keyword);

    // Búsquedas directas por campos (Spring Data JPA lo hace automáticamente)
    Optional<UsuariosEntity> findByEmail(String email);

    Optional<UsuariosEntity> findByTelefono(String telefono);

    Optional<UsuariosEntity> findByNombre(String nombre);

    // Fechas importantes
    Optional<UsuariosEntity> findById(Long id);

    // Si quieres devolver directamente solo el campo (opcional), puedes mantener las queries personalizadas:
    @Query("SELECT u.fechaRegistro FROM UsuariosEntity u WHERE u.email = ?1")
    Optional<Date> findFechaRegistroByEmail(String email);

    @Query("SELECT u.ultimoLogin FROM UsuariosEntity u WHERE u.email = ?1")
    Optional<Timestamp> findUltimoLoginByEmail(String email);
}