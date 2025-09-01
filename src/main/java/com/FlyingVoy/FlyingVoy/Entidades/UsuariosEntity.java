package com.FlyingVoy.FlyingVoy.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Usuarios")
public class UsuariosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_usuario;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

    @Column(name = "Contraseña", nullable = false)
    private String contraseña_hash;

    @Column(name = "Email", unique = true, length = 150)
    private String email;

    @Column(name = "Telefono", nullable = false)
    private String telefono;

    @Temporal(TemporalType.DATE)
    @Column(name = "Fecha-registro", nullable = false)
    private Date fechaRegistro;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ultimoLogin")
    private Timestamp ultimoLogin;


    @OneToMany(mappedBy = "usuariosEntity")
    private Set<ReservasEntity> reservasEntities ;

    @OneToMany(mappedBy = "usuariosEntity")
    private Set<ValoracionesEntity> valoracionesEntities ;





}