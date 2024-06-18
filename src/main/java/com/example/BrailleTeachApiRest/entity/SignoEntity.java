package com.example.BrailleTeachApiRest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "signo")

public class SignoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSigno", columnDefinition = "bigInt(20) not null")
    private Long idSigno;
    @Column(name = "signo", columnDefinition = "varchar(50) not null")
    private String signo;
    @Column(name = "codigo", columnDefinition = "int(11) not null")
    private Integer codigo;
}
