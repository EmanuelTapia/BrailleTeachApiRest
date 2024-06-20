package com.example.BrailleTeachApiRest.service;

import com.example.BrailleTeachApiRest.entity.AlumnoEntity;

import java.util.List;
import java.util.Optional;

public interface AlumnoService {

    List<AlumnoEntity> getAlumno();
    Optional<AlumnoEntity> getAlumnoById(Long id);
    AlumnoEntity saveAlumno(AlumnoEntity alumno);
    AlumnoEntity updateAlumnoById(AlumnoEntity alumno, Long id);
    void deleteAlumnoById(Long id);
}
