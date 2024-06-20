package com.example.BrailleTeachApiRest.service.Impl;

import com.example.BrailleTeachApiRest.entity.MuchoPocoNadaEntity;
import com.example.BrailleTeachApiRest.repository.MuchoPocoNadaRepository;
import com.example.BrailleTeachApiRest.service.MuchoPocoNadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MuchoPocoNadaServiceImpl implements MuchoPocoNadaService {

    @Autowired
    private MuchoPocoNadaRepository muchoPocoNadaRepository;

    @Override
    public List<MuchoPocoNadaEntity> getMuchoPocoNada() {
        return this.muchoPocoNadaRepository.findAll();
    }

    @Override
    public Optional<MuchoPocoNadaEntity> getMuchoPocoNadaById(Long id) {
        return this.muchoPocoNadaRepository.findById(id);
    }

    @Override
    public MuchoPocoNadaEntity saveMuchoPocoNada(MuchoPocoNadaEntity muchoPocoNada) {
        return this.muchoPocoNadaRepository.save(muchoPocoNada);
    }

    @Override
    public MuchoPocoNadaEntity updateMuchoPocoNadaById(MuchoPocoNadaEntity muchoPocoNada, Long id) {
        MuchoPocoNadaEntity muchoPocoNadaEntity = muchoPocoNadaRepository.findById(id).get();

        muchoPocoNadaEntity.setNombre(muchoPocoNada.getNombre());
        muchoPocoNadaEntity.setDescripcionVoz(muchoPocoNada.getDescripcionVoz());
        muchoPocoNadaEntity.setElementos(muchoPocoNada.getElementos());
        muchoPocoNadaEntity.setNivel(muchoPocoNada.getNivel());
        muchoPocoNadaEntity.setClasificacionCorrecta(muchoPocoNada.getClasificacionCorrecta());
        muchoPocoNadaEntity.setClasificacionUsuario(muchoPocoNada.getClasificacionUsuario());
        muchoPocoNadaEntity.setIdMinijuego(muchoPocoNada.getIdMinijuego());

        muchoPocoNadaRepository.save(muchoPocoNadaEntity);

        return muchoPocoNadaEntity;
    }

    @Override
    public void deleteMuchoPocoNadaById(Long id) {
        this.muchoPocoNadaRepository.deleteById(id);
    }
}
