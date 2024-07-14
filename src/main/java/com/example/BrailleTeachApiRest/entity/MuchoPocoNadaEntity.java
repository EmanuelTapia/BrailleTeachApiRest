package com.example.BrailleTeachApiRest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "muchopoconada")
public class MuchoPocoNadaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMuchoPocoNada", columnDefinition = "bigInt(20) not null")
    private Long idMuchoPocoNada;
    @Column(name = "Numero1", columnDefinition = "int(10) not null")
    private Integer Numero1;
    @Column(name = "Numero2", columnDefinition = "int(10) not null")
    private Integer Numero2;
    @Column(name = "Numero3", columnDefinition = "int(10) not null")
    private Integer Numero3;
    @Column(name = "Letra1", columnDefinition = "varchar(10) not null")
    private String Letra1;
    @Column(name = "Letra2", columnDefinition = "varchar(10) not null")
    private String Letra2;
    @Column(name = "Letra3", columnDefinition = "varchar(10) not null")
    private String Letra3;
    @Column(name = "Opcion1", columnDefinition = "varchar(20) not null")
    private String Opcion1;
    @Column(name = "Opcion2", columnDefinition = "varchar(20) not null")
    private String Opcion2;
    @Column(name = "Opcion3", columnDefinition = "varchar(20) not null")
    private String Opcion3;
    @Column(name = "Respuesta", columnDefinition = "varchar(50) not null")
    private Integer Respuesta;
    @Column(name = "Codigo", columnDefinition = "int(15000) not null")
    private Integer Codigo;

}
