package com.example.BrailleTeachApiRest.controller;

import com.example.BrailleTeachApiRest.entity.UsuarioEntity;
import com.example.BrailleTeachApiRest.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")

public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<UsuarioEntity> getUsuario(){
        return this.usuarioService.getUsuario();
    }

    @GetMapping(path = "/{idUsuario}")
    public Optional<UsuarioEntity> getUsuarioById(@PathVariable("idUsuario") Long id){
        return this.usuarioService.getUsuarioById(id);
    }

    @PostMapping
    public UsuarioEntity saveUsuario(@RequestBody UsuarioEntity usuario){
        return this.usuarioService.saveUsuario(usuario);
    }

    @PutMapping(path = "/{idUsuario}")
    public UsuarioEntity updateUsuarioById(@RequestBody UsuarioEntity usuario, @PathVariable("idUsuario") Long id){
        return this.usuarioService.updateUsuarioById(usuario, id);
    }

    @DeleteMapping(path = "/{idUsuario}")
    public void deleteUsuarioById(@PathVariable("idUsuario") Long id){
        this.usuarioService.deleteUsuarioById(id);
    }
}
