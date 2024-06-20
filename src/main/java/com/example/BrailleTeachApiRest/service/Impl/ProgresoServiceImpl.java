package com.example.BrailleTeachApiRest.service.Impl;

import com.example.BrailleTeachApiRest.entity.ProgresoEntity;
import com.example.BrailleTeachApiRest.repository.ProgresoRepository;
import com.example.BrailleTeachApiRest.service.ProgresoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProgresoServiceImpl implements ProgresoService{

    @Autowired
    private ProgresoRepository progresoRepository;
    @Override
    public List<ProgresoEntity> getProgreso() { return this.progresoRepository.findAll();
    }

    @Override
    public Optional<ProgresoEntity> getProgresoById(Long id) { return this.progresoRepository.findById(id);
    }

    @Override
    public ProgresoEntity saveProgreso(ProgresoEntity progreso) { return this.progresoRepository.save(progreso);
    }

    @Override
    public ProgresoEntity updateProgresoById(ProgresoEntity progreso, Long id) {

        ProgresoEntity progresoEntity = progresoRepository.findById(id).get();

        progresoEntity.setLeccioncomplet(progreso.getLeccioncomplet());
        progresoEntity.setPuntuacu(progreso.getPuntuacu());
        progresoEntity.setIdModulo(progreso.getIdModulo());
        progresoEntity.setIdInsignia(progreso.getIdInsignia());

        progresoRepository.save(progresoEntity);

        return progresoEntity;
    }

    @Override
    public void deleteProgresoById(Long id) { this.progresoRepository.deleteById(id);
    }
}
