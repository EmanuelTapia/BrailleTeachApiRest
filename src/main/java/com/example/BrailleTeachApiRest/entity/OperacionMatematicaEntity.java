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
    @Column(name = "numero1", columnDefinition = "int(20) not null")
    private String numero1;
    @Column(name = "operador", columnDefinition = "varchar(20) not null")
    private String operador;
    @Column(name = "numero2", columnDefinition = "int(20) not null")
    private Integer numero2;
    @Column(name = "respuesta", columnDefinition = "int(20) not null")
    private String respuesta;
    @Column(name = "codigo", columnDefinition = "int(20) not null")
    private Integer codigo;

}

