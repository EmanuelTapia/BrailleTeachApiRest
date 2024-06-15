package com.example.BrailleTeachApiRest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "aula")
public class AulaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAula", columnDefinition = "bigInt(20) not null")
    private Long idAula;
    @Column(name = "piso", columnDefinition = "varchar(20) not null")
    private String piso;
    @Column(name = "capacidad", columnDefinition = "int(11) not null")
    private int capacidad;
    @Column(name = "horario", columnDefinition = "varchar(50) not null")
    private String horario;
}
