package com.example.BrailleTeachApiRest.service;

import com.example.BrailleTeachApiRest.entity.MinijuegoEntity;

import java.util.List;
import java.util.Optional;

public interface MinijuegoService {

    List<MinijuegoEntity> getMinijuego();
    Optional<MinijuegoEntity> getMinijuegoById(Long id);
    MinijuegoEntity saveMinijuego(MinijuegoEntity minijuego);
    MinijuegoEntity updateMinijuegoById(MinijuegoEntity minijuego, Long id);
    void deleteMinijuegoById(Long id);
}
