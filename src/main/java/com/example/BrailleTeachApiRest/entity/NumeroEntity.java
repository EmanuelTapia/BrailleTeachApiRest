package com.example.BrailleTeachApiRest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "numero")
public class NumeroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idNumero", columnDefinition = "bigInt(20) not null")
    private Long idNumero;
    @Column(name = "numero", columnDefinition = "int(20) not null")
    private String numero;
    @Column(name = "codigo", columnDefinition = "int(20) not null")
    private Integer codigo;
}
