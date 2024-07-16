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
    @Column(name = "numero1", columnDefinition = "int(10) not null")
    private Integer numero1;
    @Column(name = "numero2", columnDefinition = "int(10) not null")
    private Integer numero2;
    @Column(name = "numero3", columnDefinition = "int(10) not null")
    private Integer numero3;
    @Column(name = "letra1", columnDefinition = "varchar(10) not null")
    private String letra1;
    @Column(name = "letra2", columnDefinition = "varchar(10) not null")
    private String letra2;
    @Column(name = "letra3", columnDefinition = "varchar(10) not null")
    private String letra3;
    @Column(name = "opcion1", columnDefinition = "varchar(20) not null")
    private String opcion1;
    @Column(name = "opcion2", columnDefinition = "varchar(20) not null")
    private String opcion2;
    @Column(name = "opcion3", columnDefinition = "varchar(20) not null")
    private String opcion3;
    @Column(name = "respuesta", columnDefinition = "varchar(50) not null")
    private String respuesta;
    @Column(name = "codigo", columnDefinition = "int(50) not null")
    private Integer codigo;

}
