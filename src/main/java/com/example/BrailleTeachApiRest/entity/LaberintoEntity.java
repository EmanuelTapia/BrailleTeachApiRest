package com.example.BrailleTeachApiRest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "laberinto")
public class LaberintoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idLaberinto", columnDefinition = "bigInt(20) not null")
    private Long idLaberinto;
    @Column(name = "nombre", columnDefinition = "varchar(50) not null")
    private String nombre;
    @Column(name = "descripcionVoz", columnDefinition = "varchar(100) not null")
    private String descripcionVoz;
    @Column(name = "representacionLaberinto", columnDefinition = "varchar(100) not null")
    private String representacionLaberinto;
    @Column(name = "nivel", columnDefinition = "int(20) not null")
    private Integer nivel;
    @Column(name = "posicion", columnDefinition = "int(50) not null")
    private Integer posicion;
    @Column(name = "respuestaCorrecta", columnDefinition = "varchar(30) not null")
    private String respuestaCorrecta;

    @ManyToOne
    @JoinColumn(name = "idMinijuego")
    private MinijuegoEntity idMinijuego;

}