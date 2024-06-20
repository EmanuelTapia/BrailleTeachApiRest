package com.example.BrailleTeachApiRest.service.Impl;

import com.example.BrailleTeachApiRest.entity.UsuarioEntity;
import com.example.BrailleTeachApiRest.repository.UsuarioRepository;
import com.example.BrailleTeachApiRest.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UsuarioServiceImple implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<UsuarioEntity> getUsuario() { return this.usuarioRepository.findAll();
    }

    @Override
    public Optional<UsuarioEntity> getUsuarioById(Long id) { return this.usuarioRepository.findById(id);
    }

    @Override
    public UsuarioEntity saveUsuario(UsuarioEntity usuario) { return this.usuarioRepository.save(usuario);}

    @Override
    public UsuarioEntity updateUsuarioById(UsuarioEntity usuario, Long id) {
        UsuarioEntity usuarioEntity = usuarioRepository.findById(id).get();

        usuarioEntity.setNombre(usuario.getNombre());
        usuarioEntity.setApellido(usuario.getApellido());
        usuarioEntity.setDni(usuario.getDni());
        usuarioEntity.setCorreo(usuario.getCorreo());
        usuarioEntity.setContraseña(usuario.getContraseña());
        usuarioEntity.setIdAula(usuario.getIdAula());

        usuarioRepository.save(usuarioEntity);

        return usuarioEntity;
    }

    @Override
    public void deleteUsuarioById(Long id) { this.usuarioRepository.deleteById(id);
    }
}
