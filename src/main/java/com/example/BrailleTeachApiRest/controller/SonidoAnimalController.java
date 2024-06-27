package com.example.BrailleTeachApiRest.controller;

import com.example.BrailleTeachApiRest.entity.SonidoAnimalEntity;
import com.example.BrailleTeachApiRest.service.SonidoAnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("/sonidoanimal")

public class SonidoAnimalController {

    @Autowired
    private SonidoAnimalService sonidoAnimalService;

    @GetMapping
    public List<SonidoAnimalEntity> getSonidoAnimal(){
        return this.sonidoAnimalService.getSonidoAnimal();
    }

    @GetMapping(path = "/{idSonidoAnimal}")
    public Optional<SonidoAnimalEntity> getSonidoAnimalById(@PathVariable("idSonidoAnimal") Long id){
        return this.sonidoAnimalService.getSonidoAnimalById(id);
    }

    @PostMapping
    public SonidoAnimalEntity saveSonidoAnimal(@RequestBody SonidoAnimalEntity sonidoAnimal){
        return this.sonidoAnimalService.saveSonidoAnimal(sonidoAnimal);
    }

    @PutMapping(path = "/{idSonidoAnimal}")
    public SonidoAnimalEntity updateSonidoAnimal(@RequestBody SonidoAnimalEntity sonidoAnimal, @PathVariable("idSonidoAnimal") Long id){
        return this.sonidoAnimalService.updateSonidoAnimalById(sonidoAnimal, id);
    }

    @DeleteMapping(path = "/{idSonidoAnimal}")
    public void deleteSonidoAnimalById(@PathVariable("idSonidoAnimal") Long id){
        this.sonidoAnimalService.deleteSonidoAnimalById(id);
    }

}
