package com.example.BrailleTeachApiRest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "sonidoanimal")
public class SonidoAnimalEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "idSonidoAnimal", columnDefinition = "bigInt(20) not null")
    private Long idSonidoAnimal;
    @Column(name = "nombre", columnDefinition = "varchar(50) not null")
    private String nombre;
    @Lob
    @Column(name = "sonido", columnDefinition = "longblob not null")
    private byte[]  sonido;
    @Column(name = "respuesta", columnDefinition = "varchar(50) not null")
    private String respuesta;
    @Column(name = "codigo", columnDefinition = "int(50) not null")
    private Integer codigo;
    @Lob
    @Column(name = "imagen", columnDefinition = "longblob not null")
    private byte[]  imagen;

}
