package com.example.BrailleTeachApiRest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "cuento")
public class CuentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCuento", columnDefinition = "bigInt(20) not null")
    private Long idCuento;
    @Column(name = "nombre", columnDefinition = "varchar(50) not null")
    private String nombre;
    @Column(name = "descripcionVoz", columnDefinition = "varchar(200) not null")
    private String descripcionVoz;
    @Column(name = "cuento", columnDefinition = "varchar(200) not null")
    private String cuento;
    @Column(name = "preguntas", columnDefinition = "varchar(100) not null")
    private String preguntas;
    @Column(name = "respuestaCorrecta", columnDefinition = "varchar(50) not null")
    private String respuestaCorrecta;

    @ManyToOne
    @JoinColumn(name = "idMinijuego")
    private MinijuegoEntity idMinijuego;

}
