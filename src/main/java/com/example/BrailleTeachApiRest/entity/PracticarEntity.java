package com.example.BrailleTeachApiRest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "practicar")
public class PracticarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPracticar", columnDefinition = "bigInt(20) not null")
    private Long idPracticar;
    @Column(name = "ejercicio_voz", columnDefinition = "varchar(50) not null")
    private String ejercicio_voz;
    @ManyToOne
    @JoinColumn(name = "idElementoBraille")
    private ElementoBrailleEntity idElementoBraille;

}
