package com.example.BrailleTeachApiRest.service.Impl;

import com.example.BrailleTeachApiRest.entity.AlumnoEntity;
import com.example.BrailleTeachApiRest.repository.AlumnoRepository;
import com.example.BrailleTeachApiRest.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class AlumnoServiceImpl implements AlumnoService{

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public List<AlumnoEntity> getAlumno() { return this.alumnoRepository.findAll();
    }

    @Override
    public Optional<AlumnoEntity> getAlumnoById(Long id) { return this.alumnoRepository.findById(id);
    }

    @Override
    public AlumnoEntity saveAlumno(AlumnoEntity alumno) { return this.alumnoRepository.save(alumno);
    }

    @Override
    public AlumnoEntity updateAlumnoById(AlumnoEntity alumno, Long id) {

        AlumnoEntity alumnoEntity = alumnoRepository.findById(id).get();

        alumnoEntity.setIdProgreso(alumno.getIdProgreso());
        alumnoEntity.setIdUsuario(alumno.getIdUsuario());

        alumnoRepository.save(alumnoEntity);

        return alumnoEntity;
    }

    @Override
    public void deleteAlumnoById(Long id) { this.alumnoRepository.deleteById(id);
    }
}
