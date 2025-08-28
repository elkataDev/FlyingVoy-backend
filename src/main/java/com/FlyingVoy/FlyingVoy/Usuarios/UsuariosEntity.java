package com.FlyingVoy.FlyingVoy.Usuarios;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Date;


@Entity
public class UsuariosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

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

//Esto solo permite que un usuario haga una UNICA valoracion
//    @Lob
//    @Column(columnDefinition = "Text", name = "Valoracion")

    //NOTA SI QUEREMOS QUE LOS USUARIOS PUEDAN REALIZAR MAS VALORACIONES
    //Se debe crear otra entidad llamada Valoraciones y que este relacionada con Usuarios
}