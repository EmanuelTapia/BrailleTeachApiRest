package com.example.BrailleTeachApiRest.service.Impl;

import com.example.BrailleTeachApiRest.entity.SonidoAnimalEntity;
import com.example.BrailleTeachApiRest.repository.SonidoAnimalRepository;
import com.example.BrailleTeachApiRest.service.SonidoAnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SonidoAnimalServiceImpl implements SonidoAnimalService {

    @Autowired
    private SonidoAnimalRepository sonidoAnimalRepository;

    @Override
    public List<SonidoAnimalEntity> getSonidoAnimal() {
        return this.sonidoAnimalRepository.findAll();
    }

    @Override
    public Optional<SonidoAnimalEntity> getSonidoAnimalById(Long id) {
        return this.sonidoAnimalRepository.findById(id);
    }

    @Override
    public SonidoAnimalEntity saveSonidoAnimal(SonidoAnimalEntity sonidoAnimal) {
        return this.sonidoAnimalRepository.save(sonidoAnimal);
    }

    @Override
    public SonidoAnimalEntity updateSonidoAnimalById(SonidoAnimalEntity sonidoAnimal, Long id) {
        SonidoAnimalEntity sonidoAnimalEntity = sonidoAnimalRepository.findById(id).get();

        sonidoAnimalEntity.setNombre(sonidoAnimal.getNombre());
        sonidoAnimalEntity.setDescripcionVoz(sonidoAnimal.getDescripcionVoz());
        sonidoAnimalEntity.setSonido(sonidoAnimal.getSonido());
        sonidoAnimalEntity.setNivel(sonidoAnimal.getNivel());
        sonidoAnimalEntity.setRespuestaCorrecta(sonidoAnimal.getRespuestaCorrecta());
        sonidoAnimalEntity.setIdMinijuego(sonidoAnimal.getIdMinijuego());

        sonidoAnimalRepository.save(sonidoAnimalEntity);

        return sonidoAnimalEntity;
    }

    @Override
    public void deleteSonidoAnimalById(Long id) {
        this.sonidoAnimalRepository.deleteById(id);

    }
}
