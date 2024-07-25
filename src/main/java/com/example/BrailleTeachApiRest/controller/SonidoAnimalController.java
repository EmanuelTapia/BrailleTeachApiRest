package com.example.BrailleTeachApiRest.controller;

import com.example.BrailleTeachApiRest.dto.SonidoAnimalDTO;
import com.example.BrailleTeachApiRest.entity.SonidoAnimalEntity;
import com.example.BrailleTeachApiRest.service.SonidoAnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/sonidoanimal")
public class SonidoAnimalController {

    @Autowired
    private SonidoAnimalService sonidoAnimalService;

    @GetMapping
    public List<SonidoAnimalDTO> getSonidoAnimal(){
        return this.sonidoAnimalService.getSonidoAnimal().stream().map(animal -> {
            String base64Imagen = Base64.getEncoder().encodeToString(animal.getImagen());
            String base64Audio = Base64.getEncoder().encodeToString(animal.getSonido());
            return new SonidoAnimalDTO(animal.getIdSonidoAnimal(), animal.getCodigo(), base64Imagen, animal.getNombre(), animal.getRespuesta(), base64Audio);
        }).collect(Collectors.toList());
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
