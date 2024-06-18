package com.example.BrailleTeachApiRest.service;

import com.example.BrailleTeachApiRest.entity.InsigniaEntity;

import java.util.List;
import java.util.Optional;

public interface InsigniaService {

    List<InsigniaEntity> getInsignia();
    Optional<InsigniaEntity> getInsigniaById(Long id);
    InsigniaEntity saveInsignia(InsigniaEntity insignia);
    InsigniaEntity updateInsigniaById(InsigniaEntity insignia, Long id);
    void deleteInsigniaById(Long id);
}
