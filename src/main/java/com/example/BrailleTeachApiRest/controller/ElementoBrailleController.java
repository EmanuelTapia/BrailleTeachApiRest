package com.example.BrailleTeachApiRest.controller;

import com.example.BrailleTeachApiRest.entity.ElementoBrailleEntity;
import com.example.BrailleTeachApiRest.service.ElementoBrailleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("/elementobraille")
public class ElementoBrailleController {

    @Autowired
    private ElementoBrailleService elementobrailleService;

    @GetMapping
    public List<ElementoBrailleEntity> getElementoBraille(){
        return this.elementobrailleService.getElementoBraille();
    }

    @GetMapping(path = "/{idAbecedario}")
    public Optional<ElementoBrailleEntity> getAbecedarioById(@PathVariable("idElementoBraille") Long id){
        return this.elementobrailleService.getElementoBrailleById(id);
    }

    @PostMapping
    public ElementoBrailleEntity saveElementoBraille(@RequestBody ElementoBrailleEntity elementobraille){
        return this.elementobrailleService.saveElementoBraille(elementobraille);
    }

    @PutMapping(path = "/{idElementoBraille}")
    public ElementoBrailleEntity updateElementoBrailleById(@RequestBody ElementoBrailleEntity elementobraille, @PathVariable("idElementoBraille") Long id){
        return this.elementobrailleService.updateElementoBrailleById(elementobraille, id);
    }

    @DeleteMapping(path = "/{idElementoBraille}")
    public void deleteElementoBrailleById(@PathVariable("idElementoBraille") Long id){

        this.elementobrailleService.deleteElementoBrailleById(id);
    }
}
