package com.example.BrailleTeachApiRest.service;

import com.example.BrailleTeachApiRest.entity.AprenderEntity;


import java.util.List;
import java.util.Optional;

public interface AprenderService {
    List<AprenderEntity> getAprender();
    Optional<AprenderEntity> getAprenderById(Long id);
    AprenderEntity saveAprender(AprenderEntity aprender);
    AprenderEntity updateAprenderById(AprenderEntity aprender, Long id);
    void deleteAprenderById(Long id);
}
