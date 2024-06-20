package com.example.BrailleTeachApiRest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "usuario")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario", columnDefinition = "bigInt(20) not null")
    private Long idUsuario;
    @Column(name = "nombre", columnDefinition = "varchar(50) not null")
    private String nombre;
    @Column(name = "apellido", columnDefinition = "varchar(50) not null")
    private String apellido;
    @Column(name = "dni", columnDefinition = "varchar(8) not null")
    private String dni;
    @Column(name = "correo", columnDefinition = "varchar(80) not null")
    private String correo;
    @Column(name = "contraseña", columnDefinition = "varchar(50) not null")
    private String contraseña;

    @ManyToOne
    @JoinColumn(name = "idAula")
    private AulaEntity idAula;
}
