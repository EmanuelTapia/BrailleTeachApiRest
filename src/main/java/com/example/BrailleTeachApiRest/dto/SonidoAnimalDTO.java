package com.example.BrailleTeachApiRest.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SonidoAnimalDTO {

    private Long idSonidoAnimal;
    private Integer codigo;
    private String imagen;
    private String nombre;
    private String respuesta;
    private String sonido;

    public SonidoAnimalDTO(Long idSonidoAnimal, Integer codigo, String imagen, String nombre, String respuesta, String sonido) {
        this.idSonidoAnimal = idSonidoAnimal;
        this.codigo = codigo;
        this.imagen = imagen;
        this.nombre = nombre;
        this.respuesta = respuesta;
        this.sonido = sonido;
    }
}
