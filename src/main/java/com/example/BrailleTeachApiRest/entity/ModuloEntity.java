package com.example.BrailleTeachApiRest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "modulo")
public class ModuloEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idModulo", columnDefinition = "bigInt(20) not null")
    private Long idModulo;

    @ManyToOne
    @JoinColumn(name = "idAprender")
    private AprenderEntity idAprender;
    @ManyToOne
    @JoinColumn(name = "idPracticar")
    private PracticarEntity idPracticar;
    @ManyToOne
    @JoinColumn(name = "idMinijuego")
    private MinijuegoEntity idMinijuego;
}
