package com.example.BrailleTeachApiRest.service;

import com.example.BrailleTeachApiRest.entity.CuentoEntity;

import java.util.List;
import java.util.Optional;

public interface CuentoService {

    List<CuentoEntity> getCuento();
    Optional<CuentoEntity> getCuentoById(Long id);
    CuentoEntity saveCuento(CuentoEntity cuento);
    CuentoEntity updateLaberintoById(CuentoEntity cuento, Long id);
    void deleteCuentoById(Long id);

}
