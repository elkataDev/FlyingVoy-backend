package com.FlyingVoy.FlyingVoy.Repositorios;

import com.FlyingVoy.FlyingVoy.Entidades.UsuariosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepository extends JpaRepository<UsuariosEntity, Long> {
/*
    // Buscar usuario por email
    Optional<UsuariosEntity> findByEmail(String email);

    // Buscar usuario por nombre
    List<UsuariosEntity> findByNombre(String nombre);

    // Buscar usuario por teléfono
    Optional<UsuariosEntity> findByTelefono(String telefono);

    // Buscar fecha de registro por email (confirma la fecha de registro)
    Optional<UsuariosEntity> findByFechaRegistro(String email);

    // Buscar fecha de registro por ID
    Optional<UsuariosEntity> findByFechaRegistro(long id);

    // Buscar nombre por ID
    Optional<UsuariosEntity> findByNombre(long id);

    // Buscar email por ID
    Optional<UsuariosEntity> findByEmail(long id);

    // Buscar telefono por ID
    Optional<UsuariosEntity> findByTelefono(long id);

    // Buscar ultimo registro por ID
    Optional<UsuariosEntity> findByUltimoRegistro(Timestamp ultimoLogin);

    // Verificar si existe un email (para validar registros)
    boolean existsByEmail(String email);

    // Verificar si existe un teléfono
    boolean existsByTelefono(String telefono);

 */
}