package com.example.BrailleTeachApiRest.service;

import com.example.BrailleTeachApiRest.entity.ProgresoEntity;

import java.util.List;
import java.util.Optional;

public interface ProgresoService {

    List<ProgresoEntity> getProgreso();
    Optional<ProgresoEntity> getProgresoById(Long id);
    ProgresoEntity saveProgreso(ProgresoEntity progreso);
    ProgresoEntity updateProgresoById(ProgresoEntity progreso, Long id);
    void deleteProgresoById(Long id);
}
