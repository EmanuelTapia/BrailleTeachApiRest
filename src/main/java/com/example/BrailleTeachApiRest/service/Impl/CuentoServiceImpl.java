package com.example.BrailleTeachApiRest.service.Impl;

import com.example.BrailleTeachApiRest.entity.CuentoEntity;

import com.example.BrailleTeachApiRest.repository.CuentoRepository;
import com.example.BrailleTeachApiRest.service.CuentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CuentoServiceImpl implements CuentoService {

    @Autowired
    private CuentoRepository cuentoRepository;

    @Override
    public List<CuentoEntity> getCuento() {
        return this.cuentoRepository.findAll();
    }

    @Override
    public Optional<CuentoEntity> getCuentoById(Long id) {
        return this.cuentoRepository.findById(id);
    }

    @Override
    public CuentoEntity saveCuento(CuentoEntity cuento) {
        return this.cuentoRepository.save(cuento);
    }

    @Override
    public CuentoEntity updateLaberintoById(CuentoEntity cuento, Long id) {
        CuentoEntity cuentoEntity = cuentoRepository.findById(id).get();

        cuentoEntity.setNombre(cuento.getNombre());
        cuentoEntity.setDescripcionVoz(cuento.getDescripcionVoz());
        cuentoEntity.setCuento(cuento.getCuento());
        cuentoEntity.setPreguntas(cuento.getPreguntas());
        cuentoEntity.setRespuestaCorrecta(cuento.getRespuestaCorrecta());
        cuentoEntity.setIdMinijuego(cuento.getIdMinijuego());

        cuentoRepository.save(cuentoEntity);

        return cuentoEntity;
    }

    @Override
    public void deleteCuentoById(Long id) {
        this.cuentoRepository.deleteById(id);

    }
}
