package com.FlyingVoy.FlyingVoy.Entidades;


import jakarta.persistence.*;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Valoraciones")
public class ValoracionesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "val_id")

    private Long id_valoracion;


    @Lob
    @Column(name = "Comentario", columnDefinition = "Text")

    private String comentario;


    @Min(0)
    @Max(5)
    @Column(name = "Puntuacion",nullable = false, columnDefinition = "TINYINT")

    private byte puntuacion;



    //Vease ReservasEntity

    @ManyToOne
    @JoinColumn(
            name = "id_usuario",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_valoracion_usuario")
    )
    private UsuariosEntity usuariosEntity;



    @ManyToOne
    @JoinColumn(
            name = "id_vuelo",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_valoracion_vuelo")
    )
    private VuelosEntity vuelosEntity;


}
