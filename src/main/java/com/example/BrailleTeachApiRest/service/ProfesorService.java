package com.example.BrailleTeachApiRest.service;

import com.example.BrailleTeachApiRest.entity.ProfesorEntity;


import java.util.List;
import java.util.Optional;
public interface ProfesorService {

    List<ProfesorEntity> getProfesor();
    Optional<ProfesorEntity> getProfesorById(Long id);
    ProfesorEntity saveProfesor(ProfesorEntity profesor);
    ProfesorEntity updateProfesorById(ProfesorEntity profesor, Long id);
    void deleteProfesorById(Long id);
}
