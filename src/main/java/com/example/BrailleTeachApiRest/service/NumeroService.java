package com.example.BrailleTeachApiRest.service;


import com.example.BrailleTeachApiRest.entity.NumeroEntity;

import java.util.List;
import java.util.Optional;

public interface NumeroService {
    List<NumeroEntity> getNumero();
    Optional<NumeroEntity> getNumeroById(Long id);
    NumeroEntity saveNumero(NumeroEntity numero);
    NumeroEntity updateNumeroById(NumeroEntity numero, Long id);
    void deleteNumeroById(Long id);
}
