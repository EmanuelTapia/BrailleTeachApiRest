package com.example.BrailleTeachApiRest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "operacionmatematica")
public class OperacionMatematicaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idOperacionMatematica", columnDefinition = "bigInt(20) not null")
    private Long idOperacionMatematica;
    @Column(name = "nombre", columnDefinition = "varchar(50) not null")
    private String nombre;
    @Column(name = "descripcionVoz", columnDefinition = "varchar(50) not null")
    private String descripcionVoz;
    @Column(name = "nivel", columnDefinition = "int(20) not null")
    private Integer nivel;
    @Column(name = "operacion", columnDefinition = "varchar(20) not null")
    private String operacion;
    @Column(name = "operandos", columnDefinition = "int(20) not null")
    private Integer operandos;
    @Column(name = "respuestaCorrecta", columnDefinition = "int(20) not null")
    private Integer respuestaCorrecta;

    @ManyToOne
    @JoinColumn(name = "idMinijuego")
    private MinijuegoEntity idMinijuego;

}
