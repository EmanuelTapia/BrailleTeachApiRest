package com.example.BrailleTeachApiRest.service;

import com.example.BrailleTeachApiRest.entity.SignoEntity;

import java.util.List;
import java.util.Optional;

public interface SignoService {

    List<SignoEntity> getSigno();
    Optional<SignoEntity> getSignoById(Long id);
    SignoEntity saveSigno(SignoEntity signo);
    SignoEntity updateSignoById(SignoEntity signo, Long id);
    void deleteSignoById(Long id);
}
