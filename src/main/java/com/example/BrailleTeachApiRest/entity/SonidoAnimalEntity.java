package com.example.BrailleTeachApiRest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "sonidoanimal")
public class SonidoAnimalEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "idSonidoAnimal", columnDefinition = "bigInt(20) not null")
    private Long idSonidoAnimal;
    @Column(name = "nombre", columnDefinition = "varchar(50) not null")
    private String nombre;
    @Column(name = "descripcionVoz", columnDefinition = "varchar(50) not null")
    private String descripcionVoz;
    @Column(name = "sonido", columnDefinition = "varchar(50) not null")
    private String sonido;
    @Column(name = "nivel", columnDefinition = "int(20) not null")
    private Integer nivel;
    @Column(name = "respuestaCorrecta", columnDefinition = "int(50) not null")
    private Integer respuestaCorrecta;

    @ManyToOne
    @JoinColumn(name = "idMinijuego")
    private MinijuegoEntity idMinijuego;

}
