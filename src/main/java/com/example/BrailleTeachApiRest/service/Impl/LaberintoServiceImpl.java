package com.example.BrailleTeachApiRest.service.Impl;

import com.example.BrailleTeachApiRest.entity.LaberintoEntity;
import com.example.BrailleTeachApiRest.repository.LaberintoRepository;
import com.example.BrailleTeachApiRest.service.LaberintoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LaberintoServiceImpl implements LaberintoService {

    @Autowired
    private LaberintoRepository laberintoRepository;

    @Override
    public List<LaberintoEntity> getLaberinto() {
        return this.laberintoRepository.findAll();
    }

    @Override
    public Optional<LaberintoEntity> getLaberintoById(Long id) {
        return this.laberintoRepository.findById(id);
    }

    @Override
    public LaberintoEntity saveLaberinto(LaberintoEntity laberinto) {
        return this.laberintoRepository.save(laberinto);
    }

    @Override
    public LaberintoEntity updateLaberintoById(LaberintoEntity laberinto, Long id) {
        LaberintoEntity laberintoEntity = laberintoRepository.findById(id).get();

        laberintoEntity.setNombre(laberinto.getNombre());
        laberintoEntity.setDescripcionVoz(laberinto.getDescripcionVoz());
        laberintoEntity.setRepresentacionLaberinto(laberinto.getRepresentacionLaberinto());
        laberintoEntity.setNivel(laberinto.getNivel());
        laberintoEntity.setPosicion(laberinto.getPosicion());
        laberintoEntity.setRespuestaCorrecta(laberinto.getRespuestaCorrecta());
        laberintoEntity.setIdMinijuego(laberinto.getIdMinijuego());

        laberintoRepository.save(laberintoEntity);

        return laberintoEntity;
    }

    @Override
    public void deleteLaberintoById(Long id) {
        this.laberintoRepository.deleteById(id);

    }
}
