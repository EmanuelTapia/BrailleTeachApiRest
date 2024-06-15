package com.example.BrailleTeachApiRest.service;

import com.example.BrailleTeachApiRest.entity.AulaEntity;

import java.util.List;
import java.util.Optional;

public interface AulaService {

    List<AulaEntity> getAula();
    Optional<AulaEntity> getAulaById(Long id);
    AulaEntity saveAula(AulaEntity aula);
    AulaEntity updateAulaById(AulaEntity aula, Long id);
    void deleteAulaById(Long id);
}
