package com.example.BrailleTeachApiRest.service.Impl;

import com.example.BrailleTeachApiRest.entity.AprenderEntity;
import com.example.BrailleTeachApiRest.repository.AprenderRepository;
import com.example.BrailleTeachApiRest.service.AprenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AprenderServicelmpl implements AprenderService {

    @Autowired
    private AprenderRepository aprenderRepository;

    @Override
    public List<AprenderEntity> getAprender() {
        return this.aprenderRepository.findAll();
    }

    @Override
    public Optional<AprenderEntity> getAprenderById(Long id) {
        return this.aprenderRepository.findById(id);
    }

    @Override
    public AprenderEntity saveAprender(AprenderEntity aprender) {
        return this.aprenderRepository.save(aprender);
    }

    @Override
    public AprenderEntity updateAprenderById(AprenderEntity aprender, Long id) {
        AprenderEntity aprenderEntity=aprenderRepository.findById(id).get();

        aprenderEntity.setIdElementoBraille(aprender.getIdElementoBraille());
        aprenderEntity.setLeccion_voz(aprender.getLeccion_voz());

        aprenderRepository.save(aprenderEntity);
        return aprenderEntity;
    }

    @Override
    public void deleteAprenderById(Long id) {
        this.aprenderRepository.deleteById(id);

    }
}
