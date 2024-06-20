package com.example.BrailleTeachApiRest.service;

import com.example.BrailleTeachApiRest.entity.LaberintoEntity;

import java.util.List;
import java.util.Optional;

public interface LaberintoService {

    List<LaberintoEntity> getLaberinto();
    Optional<LaberintoEntity> getLaberintoById(Long id);
    LaberintoEntity saveLaberinto(LaberintoEntity laberinto);
    LaberintoEntity updateLaberintoById(LaberintoEntity laberinto, Long id);
    void deleteLaberintoById(Long id);

}
