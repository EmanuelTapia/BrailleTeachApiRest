package com.example.BrailleTeachApiRest.service;

import com.example.BrailleTeachApiRest.entity.SignoEntity;

import java.util.List;
import java.util.Optional;

public interface SignoService {

    List<SignoEntity> getSignos();
    Optional<SignoEntity> getSygnosById(Long id);
    SignoEntity saveSignos(SignoEntity signos);
    SignoEntity updateSignosById(SignoEntity signos, Long id);
    void deleteSignosById(Long id);
}
