package com.example.BrailleTeachApiRest.service;

import com.example.BrailleTeachApiRest.entity.UsuarioEntity;


import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    List<UsuarioEntity> getUsuario();
    Optional<UsuarioEntity> getUsuarioById(Long id);
    UsuarioEntity saveUsuario(UsuarioEntity usuario);
    UsuarioEntity updateUsuarioById(UsuarioEntity usuario, Long id);
    void deleteUsuarioById(Long id);
}
