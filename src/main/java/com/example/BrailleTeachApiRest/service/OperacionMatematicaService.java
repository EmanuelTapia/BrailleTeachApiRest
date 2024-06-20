package com.example.BrailleTeachApiRest.service;

import com.example.BrailleTeachApiRest.entity.OperacionMatematicaEntity;

import java.util.List;
import java.util.Optional;

public interface OperacionMatematicaService {

    List<OperacionMatematicaEntity> getOperacionMatematica();
    Optional<OperacionMatematicaEntity> getOperacionMatematicaById(Long id);
    OperacionMatematicaEntity saveOperacionMatematica(OperacionMatematicaEntity operacionMatematica);
    OperacionMatematicaEntity updateOperacionMatematicaById(OperacionMatematicaEntity operacionMatematica, Long id);
    void deleteOperacionMatematicaById(Long id);
}
