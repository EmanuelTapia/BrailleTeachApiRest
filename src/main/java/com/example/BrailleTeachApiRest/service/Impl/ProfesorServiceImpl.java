package com.example.BrailleTeachApiRest.service.Impl;

import com.example.BrailleTeachApiRest.entity.ProfesorEntity;
import com.example.BrailleTeachApiRest.repository.ProfesorRepository;
import com.example.BrailleTeachApiRest.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProfesorServiceImpl implements ProfesorService{

    @Autowired
    private ProfesorRepository profesorRepository;

    @Override
    public List<ProfesorEntity> getProfesor() { return this.profesorRepository.findAll();
    }

    @Override
    public Optional<ProfesorEntity> getProfesorById(Long id) { return this.profesorRepository.findById(id);
    }

    @Override
    public ProfesorEntity saveProfesor(ProfesorEntity profesor) { return this.profesorRepository.save(profesor);
    }

    @Override
    public ProfesorEntity updateProfesorById(ProfesorEntity profesor, Long id) {
        ProfesorEntity profesorEntity = profesorRepository.findById(id).get();

        profesorEntity.setCertificacion(profesor.getCertificacion());
        profesorEntity.setIdUsuario(profesor.getIdUsuario());

        profesorRepository.save(profesorEntity);
        return profesorEntity;
    }

    @Override
    public void deleteProfesorById(Long id) { this.profesorRepository.deleteById(id);

    }
}
