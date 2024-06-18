package com.example.BrailleTeachApiRest.service.Impl;

import com.example.BrailleTeachApiRest.entity.SignoEntity;
import com.example.BrailleTeachApiRest.repository.SignoRepository;
import com.example.BrailleTeachApiRest.service.SignoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SignoServiceImpl implements SignoService {

    @Autowired
    private SignoRepository signoRepository;

    @Override
    public List<SignoEntity> getSigno() { return this.signoRepository.findAll();
    }

    @Override
    public Optional<SignoEntity> getSignoById(Long id) {
        return this.signoRepository.findById(id);
    }

    @Override
    public SignoEntity saveSigno(SignoEntity signo) {
        return this.signoRepository.save(signo);
    }

    @Override
    public SignoEntity updateSignoById(SignoEntity signo, Long id) {

        SignoEntity signoEntity = signoRepository.findById(id).get();

        signoEntity.setSigno(signo.getSigno());
        signoEntity.setCodigo(signo.getCodigo());

        signoRepository.save(signoEntity);

        return signoEntity;
    }

    @Override
    public void deleteSignoById(Long id) {
        this.signoRepository.deleteById(id);
    }
}
