package com.example.BrailleTeachApiRest.service.Impl;

import com.example.BrailleTeachApiRest.entity.InsigniaEntity;
import com.example.BrailleTeachApiRest.repository.InsigniaRepository;
import com.example.BrailleTeachApiRest.service.InsigniaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class InsigniaServiceImpl implements InsigniaService{

    @Autowired
    private InsigniaRepository insigniaRepository;

    @Override
    public List<InsigniaEntity> getInsignia() { return this.insigniaRepository.findAll();
    }

    @Override
    public Optional<InsigniaEntity> getInsigniaById(Long id) { return this.insigniaRepository.findById(id);
    }

    @Override
    public InsigniaEntity saveInsignia(InsigniaEntity insignia) { return this.insigniaRepository.save(insignia);
    }

    @Override
    public InsigniaEntity updateInsigniaById(InsigniaEntity insignia, Long id) {
        InsigniaEntity insigniaEntity = insigniaRepository.findById(id).get();

        insigniaEntity.setNombre(insignia.getNombre());
        insigniaEntity.setDescripcionAudio(insignia.getDescripcionAudio());
        insigniaEntity.setRequisito(insignia.getRequisito());

        insigniaRepository.save(insigniaEntity);

        return insigniaEntity;
    }

    @Override
    public void deleteInsigniaById(Long id) { this.insigniaRepository.deleteById(id);
    }
}
