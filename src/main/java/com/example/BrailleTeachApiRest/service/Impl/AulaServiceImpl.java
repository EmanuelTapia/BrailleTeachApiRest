package com.example.BrailleTeachApiRest.service.Impl;

import com.example.BrailleTeachApiRest.entity.AulaEntity;
import com.example.BrailleTeachApiRest.repository.AulaRepository;
import com.example.BrailleTeachApiRest.service.AulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AulaServiceImpl implements AulaService {

    @Autowired
    private AulaRepository aulaRepository;

    @Override
    public List<AulaEntity> getAula() { return this.aulaRepository.findAll();
    }

    @Override
    public Optional<AulaEntity> getAulaById(Long id) {
        return this.aulaRepository.findById(id);
    }

    @Override
    public AulaEntity saveAula(AulaEntity aula) {
        return this.aulaRepository.save(aula);
    }

    @Override
    public AulaEntity updateAulaById(AulaEntity aula, Long id) {
        AulaEntity aulaEntity = aulaRepository.findById(id).get();

        aulaEntity.setPiso(aula.getPiso());
        aulaEntity.setCapacidad(aula.getCapacidad());
        aulaEntity.setHorario(aula.getHorario());

        aulaRepository.save(aulaEntity);

        return aulaEntity;
    }

    @Override
    public void deleteAulaById(Long id) {
        this.aulaRepository.deleteById(id);
    }

}
