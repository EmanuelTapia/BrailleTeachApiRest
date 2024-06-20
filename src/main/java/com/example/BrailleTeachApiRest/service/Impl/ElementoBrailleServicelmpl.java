package com.example.BrailleTeachApiRest.service.Impl;


import com.example.BrailleTeachApiRest.entity.ElementoBrailleEntity;
import com.example.BrailleTeachApiRest.repository.ElementoBrailleRepository;
import com.example.BrailleTeachApiRest.service.ElementoBrailleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ElementoBrailleServicelmpl implements ElementoBrailleService {

    @Autowired
    private ElementoBrailleRepository elementobrailleRepository;

    @Override
    public List<ElementoBrailleEntity> getElementoBraille() {
        return this.elementobrailleRepository.findAll();
    }

    @Override
    public Optional<ElementoBrailleEntity> getElementoBrailleById(Long id) {
        return this.elementobrailleRepository.findById(id);
    }

    @Override
    public ElementoBrailleEntity saveElementoBraille(ElementoBrailleEntity elementobraille) {
        return this.elementobrailleRepository.save(elementobraille);
    }

    @Override
    public ElementoBrailleEntity updateElementoBrailleById(ElementoBrailleEntity elementobraille, Long id) {
        ElementoBrailleEntity elementobrailleEntity=elementobrailleRepository.findById(id).get();

        elementobrailleEntity.setIdAbecedario(elementobraille.getIdAbecedario());
        elementobrailleEntity.setIdNumero(elementobraille.getIdNumero());
        elementobrailleEntity.setIdSigno(elementobraille.getIdSigno());

        elementobrailleRepository.save(elementobrailleEntity);


        return elementobrailleEntity;
    }

    @Override
    public void deleteElementoBrailleById(Long id) {
        this.elementobrailleRepository.deleteById(id);

    }
}
