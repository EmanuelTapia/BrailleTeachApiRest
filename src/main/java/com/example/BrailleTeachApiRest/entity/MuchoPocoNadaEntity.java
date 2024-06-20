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
    @Column(name = "nombre", columnDefinition = "varchar(50) not null")
    private String nombre;
    @Column(name = "descripcionVoz", columnDefinition = "varchar(100) not null")
    private String descripcionVoz;
    @Column(name = "elementos", columnDefinition = "int(50) not null")
    private Integer elementos;
    @Column(name = "nivel", columnDefinition = "int(20) not null")
    private Integer nivel;
    @Column(name = "clasificacionCorrecta", columnDefinition = "varchar(50) not null")
    private String clasificacionCorrecta;
    @Column(name = "clasificacionUsuario", columnDefinition = "varchar(50) not null")
    private String clasificacionUsuario;

    @ManyToOne
    @JoinColumn(name = "idMinijuego")
    private MinijuegoEntity idMinijuego;

}
