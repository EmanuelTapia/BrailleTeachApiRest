package com.example.BrailleTeachApiRest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "aprender")
public class AprenderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAprender", columnDefinition = "bigInt(20) not null")
    private Long idAprender;
    @Column(name = "leccion_voz", columnDefinition = "varchar(100) not null")
    private String leccion_voz;
    @ManyToOne
    @JoinColumn(name = "idElementoBraille")
    private ElementoBrailleEntity idElementoBraille;
}
