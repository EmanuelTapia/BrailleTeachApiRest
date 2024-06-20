package com.example.BrailleTeachApiRest.service;

import com.example.BrailleTeachApiRest.entity.ModuloEntity;


import java.util.List;
import java.util.Optional;

public interface ModuloService {
    List<ModuloEntity> getModulo();
    Optional<ModuloEntity> getModuloById(Long id);
    ModuloEntity saveModulo(ModuloEntity modulo);
    ModuloEntity updateModuloById(ModuloEntity modulo, Long id);
    void deleteModuloById(Long id);
}
