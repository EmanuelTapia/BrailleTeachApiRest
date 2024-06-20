package com.example.BrailleTeachApiRest.controller;


import com.example.BrailleTeachApiRest.entity.LaberintoEntity;
import com.example.BrailleTeachApiRest.service.LaberintoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/laberinto")
public class LaberintoController {

    @Autowired
    private LaberintoService laberintoService;

    @GetMapping
    public List<LaberintoEntity> getLaberinto(){
        return this.laberintoService.getLaberinto();
    }

    @GetMapping(path = "/{idLaberinto}")
    public Optional<LaberintoEntity> getLaberintoById(@PathVariable("idLaberinto") Long id){
        return this.laberintoService.getLaberintoById(id);
    }

    @PostMapping
    public LaberintoEntity saveLaberinto(@RequestBody LaberintoEntity laberinto){
        return this.laberintoService.saveLaberinto(laberinto);
    }

    @PutMapping(path = "/{idLaberinto}")
    public LaberintoEntity updateLaberinto(@RequestBody LaberintoEntity laberinto, @PathVariable("idLaberinto")Long id){
        return this.laberintoService.updateLaberintoById(laberinto, id);
    }

    @DeleteMapping(path = "/{idLaberinto}")
    public void daleteLaberintoById(@PathVariable("idLaberinto") Long id){
        this.laberintoService.deleteLaberintoById(id);
    }
}
