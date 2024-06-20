package com.example.BrailleTeachApiRest.service.Impl;

import com.example.BrailleTeachApiRest.entity.OperacionMatematicaEntity;
import com.example.BrailleTeachApiRest.repository.OperacionMatematicaRepository;
import com.example.BrailleTeachApiRest.service.OperacionMatematicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OperacionMatematicaImpl implements OperacionMatematicaService {

    @Autowired
    private OperacionMatematicaRepository operacionMatematicaRepository;

    @Override
    public List<OperacionMatematicaEntity> getOperacionMatematica() {
        return this.operacionMatematicaRepository.findAll();
    }

    @Override
    public Optional<OperacionMatematicaEntity> getOperacionMatematicaById(Long id) {
        return this.operacionMatematicaRepository.findById(id);
    }

    @Override
    public OperacionMatematicaEntity saveOperacionMatematica(OperacionMatematicaEntity operacionMatematica) {
        return this.operacionMatematicaRepository.save(operacionMatematica);
    }

    @Override
    public OperacionMatematicaEntity updateOperacionMatematicaById(OperacionMatematicaEntity operacionMatematica, Long id) {
        OperacionMatematicaEntity operacionMatematicaEntity = operacionMatematicaRepository.findById(id).get();

        operacionMatematicaEntity.setNombre(operacionMatematica.getNombre());
        operacionMatematicaEntity.setDescripcionVoz(operacionMatematica.getDescripcionVoz());
        operacionMatematicaEntity.setNivel(operacionMatematica.getNivel());
        operacionMatematicaEntity.setOperacion(operacionMatematica.getOperacion());
        operacionMatematicaEntity.setOperandos(operacionMatematica.getOperandos());
        operacionMatematicaEntity.setRespuestaCorrecta(operacionMatematica.getRespuestaCorrecta());
        operacionMatematicaEntity.setIdMinijuego(operacionMatematica.getIdMinijuego());

        operacionMatematicaRepository.save(operacionMatematicaEntity);

        return operacionMatematicaEntity;
    }

    @Override
    public void deleteOperacionMatematicaById(Long id) {
        this.operacionMatematicaRepository.deleteById(id);

    }
}
