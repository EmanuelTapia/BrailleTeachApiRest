package com.example.BrailleTeachApiRest.service;


import com.example.BrailleTeachApiRest.entity.PracticarEntity;

import java.util.List;
import java.util.Optional;

public interface PracticarService {
    List<PracticarEntity> getPracticar();
    Optional<PracticarEntity> getPracticarById(Long id);
    PracticarEntity savePracticar(PracticarEntity practicar);
    PracticarEntity updatePracticarById(PracticarEntity practicar, Long id);
    void deletePracticarById(Long id);
}
