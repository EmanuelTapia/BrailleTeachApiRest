package com.example.BrailleTeachApiRest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "profesor")

public class ProfesorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProfesor", columnDefinition = "bigInt(20) not null")
    private Long idProfesor;
    @Column(name = "certificacion", columnDefinition = "varchar(50) not null")
    private String certificacion;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private UsuarioEntity idUsuario;
}
