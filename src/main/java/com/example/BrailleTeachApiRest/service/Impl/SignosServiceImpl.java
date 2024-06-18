package com.example.BrailleTeachApiRest.service.Impl;

import com.example.BrailleTeachApiRest.entity.SignoEntity;
import com.example.BrailleTeachApiRest.repository.SignoRepository;
import com.example.BrailleTeachApiRest.service.SignoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class SignosServiceImpl implements SignoService {

    @Autowired
    private SignoRepository signosRepository;

    @Override
    public List<SignoEntity> getSignos() { return this.signosRepository.findAll();
    }

    @Override
    public Optional<SignoEntity> getSygnosById(Long id) { return this.signosRepository.findById(id);
    }

    @Override
    public SignoEntity saveSignos(SignoEntity signos) { return this.signosRepository.save(signos);
    }

    @Override
    public SignoEntity updateSignosById(SignoEntity signos, Long id) {

        SignoEntity signosEntity = signosRepository.findById(id).get();

        signosEntity.setSigno(signos.getSigno());
        signosEntity.setCodigo(signos.getCodigo());

        signosRepository.save(signosEntity);

        return signosEntity;
    }

    @Override
    public void deleteSignosById(Long id) { this.signosRepository.deleteById(id);

    }
}
