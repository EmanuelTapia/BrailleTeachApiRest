package com.example.BrailleTeachApiRest.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "minijuego" )
public class MinijuegoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMinijuego", columnDefinition = "bigInt(20) not null")
    private Long idMinijuego;
    @Column(name = "nombre", columnDefinition = "varchar(50) not null")
    private String nombre;
    @Column(name = "categoria", columnDefinition = "varchar(50) not null")
    private String categoria;

}
