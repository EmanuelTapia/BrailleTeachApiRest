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
    public List<MuchoPocoNadaEntity> getMuchoPocoNada() {return this.muchoPocoNadaRepository.findAll();
    }

    @Override
    public Optional<MuchoPocoNadaEntity> getMuchoPocoNadaById(Long id) {return this.muchoPocoNadaRepository.findById(id);
    }

    @Override
    public MuchoPocoNadaEntity saveMuchoPocoNada(MuchoPocoNadaEntity muchoPocoNada) {
        return this.muchoPocoNadaRepository.save(muchoPocoNada);
    }

    @Override
    public MuchoPocoNadaEntity updateMuchoPocoNadaById(MuchoPocoNadaEntity muchoPocoNada, Long id) {
        MuchoPocoNadaEntity muchoPocoNadaEntity = muchoPocoNadaRepository.findById(id).get();

        muchoPocoNadaEntity.setNumero1(muchoPocoNadaEntity.getNumero1());
        muchoPocoNadaEntity.setNumero2(muchoPocoNadaEntity.getNumero2());
        muchoPocoNadaEntity.setNumero3(muchoPocoNadaEntity.getNumero3());
        muchoPocoNadaEntity.setLetra1(muchoPocoNadaEntity.getLetra1());
        muchoPocoNadaEntity.setLetra2(muchoPocoNadaEntity.getLetra2());
        muchoPocoNadaEntity.setLetra3(muchoPocoNadaEntity.getLetra3());
        muchoPocoNadaEntity.setOpcion1(muchoPocoNadaEntity.getOpcion1());
        muchoPocoNadaEntity.setOpcion2(muchoPocoNadaEntity.getOpcion2());
        muchoPocoNadaEntity.setOpcion3(muchoPocoNadaEntity.getOpcion3());
        muchoPocoNadaEntity.setRespuesta(muchoPocoNada.getRespuesta());
        muchoPocoNadaEntity.setCodigo(muchoPocoNada.getCodigo());

        muchoPocoNadaRepository.save(muchoPocoNadaEntity);
        return muchoPocoNadaEntity;
    }

    @Override
    public void deleteMuchoPocoNadaById(Long id) {
        this.muchoPocoNadaRepository.deleteById(id);
    }
}
