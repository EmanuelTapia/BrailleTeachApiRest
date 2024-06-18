package com.example.BrailleTeachApiRest.service;

import com.example.BrailleTeachApiRest.entity.AbecedarioEntity;


import java.util.List;
import java.util.Optional;

public interface AbecedarioService {
    List<AbecedarioEntity> getAbecedario();
    Optional<AbecedarioEntity> getAbecedarioById(Long id);
    AbecedarioEntity saveAbecedario(AbecedarioEntity abecedario);
    AbecedarioEntity updateAbecedarioById(AbecedarioEntity abecedario, Long id);
    void deleteAbecedarioById(Long id);
}
