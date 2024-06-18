package com.example.BrailleTeachApiRest.controller;

import com.example.BrailleTeachApiRest.entity.NumeroEntity;
import com.example.BrailleTeachApiRest.service.NumeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/numero")
public class NumeroController {
    @Autowired
    private NumeroService numeroService;

    @GetMapping
    public List<NumeroEntity> getNumero(){
        return this.numeroService.getNumero();
    }
    @GetMapping(path = "/{idNumero}")
    public Optional<NumeroEntity> getNumeroById(@PathVariable("idNumero") Long id){
        return this.numeroService.getNumeroById(id);
    }

    @PostMapping
    public NumeroEntity saveNumero(@RequestBody NumeroEntity numero){
        return this.numeroService.saveNumero(numero);
    }

    @PutMapping(path = "/{idNumero}")
    public NumeroEntity updateNumeorById(@RequestBody NumeroEntity numero, @PathVariable("idNumero") Long id){
        return this.numeroService.updateNumeroById(numero, id);
    }

    @DeleteMapping(path = "/{idNumero}")
    public void deleteNumeroById(@PathVariable("idNumero") Long id){

        this.numeroService.deleteNumeroById(id);
    }

}
