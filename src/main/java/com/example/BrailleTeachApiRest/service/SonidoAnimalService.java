package com.example.BrailleTeachApiRest.service;

import com.example.BrailleTeachApiRest.entity.SonidoAnimalEntity;

import java.util.List;
import java.util.Optional;

public interface SonidoAnimalService {

    List<SonidoAnimalEntity> getSonidoAnimal();
    Optional<SonidoAnimalEntity> getSonidoAnimalById(Long id);
    SonidoAnimalEntity saveSonidoAnimal(SonidoAnimalEntity sonidoAnimal);
    SonidoAnimalEntity updateSonidoAnimalById(SonidoAnimalEntity sonidoAnimal, Long id);
    void deleteSonidoAnimalById(Long id);
}
