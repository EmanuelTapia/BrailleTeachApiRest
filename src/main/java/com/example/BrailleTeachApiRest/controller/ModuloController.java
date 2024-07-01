package com.example.BrailleTeachApiRest.controller;

import com.example.BrailleTeachApiRest.entity.ModuloEntity;
import com.example.BrailleTeachApiRest.service.ModuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("/modulo")
public class ModuloController {

    @Autowired
    private ModuloService moduloService;

    @GetMapping
    public List<ModuloEntity> getModulo(){
        return this.moduloService.getModulo();
    }

    @GetMapping(path = "/{idModulo}")
    public Optional<ModuloEntity> getModuloById(@PathVariable("idModulo") Long id){
        return this.moduloService.getModuloById(id);
    }

    @PostMapping
    public ModuloEntity saveModulo(@RequestBody ModuloEntity modulo){
        return this.moduloService.saveModulo(modulo);
    }

    @PutMapping(path = "/{idModulo}")
    public ModuloEntity updateModuloById(@RequestBody ModuloEntity modulo, @PathVariable("idModulo") Long id){
        return this.moduloService.updateModuloById(modulo, id);
    }

    @DeleteMapping(path = "/{idModulo}")
    public void deleteModuloById(@PathVariable("idModulo") Long id){

        this.moduloService.deleteModuloById(id);
    }
}
