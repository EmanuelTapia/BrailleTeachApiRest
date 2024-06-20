package com.example.BrailleTeachApiRest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "progreso")

public class ProgresoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProgreso", columnDefinition = "bigInt(20) not null")
    private Long idProgreso;
    @Column(name = "leccioncomplet", columnDefinition = "varchar(50) not null")
    private String leccioncomplet;
    @Column(name = "puntuacu", columnDefinition = "int(20) not null")
    private Integer puntuacu;

    @ManyToOne
    @JoinColumn(name = "idModulo")
    private ModuloEntity idModulo;
    @ManyToOne
    @JoinColumn(name = "idInsignia")
    private InsigniaEntity idInsignia;
}
