package com.example.BrailleTeachApiRest.service.Impl;


import com.example.BrailleTeachApiRest.entity.NumeroEntity;
import com.example.BrailleTeachApiRest.repository.NumeroRepository;
import com.example.BrailleTeachApiRest.service.NumeroService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class NumeroServicelmpl implements NumeroService {


    @Autowired
    private NumeroRepository numeroRepository;

    @Override
    public List<NumeroEntity> getNumero() {
        return this.numeroRepository.findAll();
    }

    @Override
    public Optional<NumeroEntity> getNumeroById(Long id) {
        return this.numeroRepository.findById(id);
    }

    @Override
    public NumeroEntity saveNumero(NumeroEntity numero) {
        return this.numeroRepository.save(numero);
    }

    @Override
    public NumeroEntity updateNumeroById(NumeroEntity numero, Long id) {
        NumeroEntity numeroEntity=numeroRepository.findById(id).get();
        numeroEntity.setNumero(numero.getNumero());
        numeroEntity.setCodigo(numero.getCodigo());
        numeroRepository.save(numeroEntity);
        return numeroEntity;
    }

    @Override
    public void deleteNumeroById(Long id) {
        this.numeroRepository.deleteById(id);

    }
}
