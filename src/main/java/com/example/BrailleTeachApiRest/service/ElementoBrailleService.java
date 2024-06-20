package com.example.BrailleTeachApiRest.service;


import com.example.BrailleTeachApiRest.entity.ElementoBrailleEntity;

import java.util.List;
import java.util.Optional;

public interface ElementoBrailleService {
    List<ElementoBrailleEntity> getElementoBraille();
    Optional<ElementoBrailleEntity> getElementoBrailleById(Long id);
    ElementoBrailleEntity saveElementoBraille(ElementoBrailleEntity elementobraille);
    ElementoBrailleEntity updateElementoBrailleById(ElementoBrailleEntity elementobraille, Long id);
    void deleteElementoBrailleById(Long id);
}
