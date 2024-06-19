package com.example.BrailleTeachApiRest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "elementobraille")
public class ElementoBrailleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idElementoBraille", columnDefinition = "bigInt(20) not null")
    private Long idElementoBraille;
    @ManyToOne
    @JoinColumn(name = "idAbecedario")
    private AbecedarioEntity idAbecedario;
    @ManyToOne
    @JoinColumn(name = "idNumero")
    private NumeroEntity idNumero;
    @ManyToOne
    @JoinColumn(name = "idSigno")
    private SignoEntity idSigno;

}
