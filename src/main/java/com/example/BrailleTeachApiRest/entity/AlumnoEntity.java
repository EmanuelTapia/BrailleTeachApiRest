package com.example.BrailleTeachApiRest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "alumno")

public class AlumnoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAlumno", columnDefinition = "bigInt(20) not null")
    private Long idAlumno;

    @ManyToOne
    @JoinColumn(name = "idProgreso")
    private ProgresoEntity idProgreso;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private UsuarioEntity idUsuario;
}
