package com.FlyingVoy.FlyingVoy.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Reservas")
public class ReservasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReserva;

    //
    @ManyToOne
    @JoinColumn(
            name = "id_usuario",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_reserva_usuario")
    )
    private UsuariosEntity usuariosEntity;

    @ManyToOne
    @JoinColumn(
            name = "id_vuelo",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_reserva_vuelo")
    )

    private VuelosEntity vuelosEntity;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_reserva")
    private Date fechaReserva;
}
