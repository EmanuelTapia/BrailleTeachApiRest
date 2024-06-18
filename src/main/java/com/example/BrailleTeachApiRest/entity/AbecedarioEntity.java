package com.example.BrailleTeachApiRest.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "abecedario")
public class AbecedarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAbecedario", columnDefinition = "bigInt(20) not null")
    private Long idAbecedario;
    @Column(name = "letra", columnDefinition = "varchar(20) not null")
    private String letra;
    @Column(name = "codigo", columnDefinition = "int(20) not null")
    private Integer codigo;

}
