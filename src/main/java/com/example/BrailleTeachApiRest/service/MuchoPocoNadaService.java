package com.example.BrailleTeachApiRest.service;

import com.example.BrailleTeachApiRest.entity.MuchoPocoNadaEntity;

import java.util.List;
import java.util.Optional;

public interface MuchoPocoNadaService {

    List<MuchoPocoNadaEntity> getMuchoPocoNada();
    Optional<MuchoPocoNadaEntity> getMuchoPocoNadaById(Long id);
    MuchoPocoNadaEntity saveMuchoPocoNada(MuchoPocoNadaEntity muchoPocoNada);
    MuchoPocoNadaEntity updateMuchoPocoNadaById(MuchoPocoNadaEntity muchoPocoNada, Long id);
    void deleteMuchoPocoNadaById(Long id);
}
