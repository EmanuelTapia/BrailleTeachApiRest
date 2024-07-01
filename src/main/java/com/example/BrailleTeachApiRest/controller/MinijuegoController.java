package com.example.BrailleTeachApiRest.controller;

import com.example.BrailleTeachApiRest.entity.MinijuegoEntity;
import com.example.BrailleTeachApiRest.service.MinijuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("/minijuego")
public class MinijuegoController {

    @Autowired
    private MinijuegoService minijuegoService;

    @GetMapping
    public List<MinijuegoEntity> getMinijuego(){
        return this.minijuegoService.getMinijuego();
    }

    @GetMapping(path = "/{idMinijuego}")
    public Optional<MinijuegoEntity> getMinijuegoById(@PathVariable("idMinijuego") Long id){
        return this.minijuegoService.getMinijuegoById(id);
    }

    @PostMapping
    public MinijuegoEntity saveMinijuego(@RequestBody MinijuegoEntity minijuego){
        return this.minijuegoService.saveMinijuego(minijuego);
    }

    @PutMapping(path = "/{idMinijuego}")
    public MinijuegoEntity updateMinijuegoById(@RequestBody MinijuegoEntity minijuego, @PathVariable("idMinijuego") Long id){
        return this.minijuegoService.updateMinijuegoById(minijuego, id);
    }

    @DeleteMapping(path = "/{idMinijuego}")
    public void deleteMinijuegoById(@PathVariable("idMinijuego") Long id){
        this.minijuegoService.deleteMinijuegoById(id);
    }

}
