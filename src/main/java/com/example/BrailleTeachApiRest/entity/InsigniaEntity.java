package com.example.BrailleTeachApiRest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "insignia")

public class InsigniaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idInsignia", columnDefinition = "bigInt(20) not null")
    private Long idInsignia;
    @Column(name = "nombre", columnDefinition = "varchar(20) not null")
    private String nombre;
    @Column(name = "descripcionAudio", columnDefinition = "varchar(100) not null")
    private String descripcionAudio;
    @Column(name = "requisito", columnDefinition = "varchar(50) not null")
    private String requisito;
}
