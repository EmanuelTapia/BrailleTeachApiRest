package com.example.BrailleTeachApiRest.controller;

import com.example.BrailleTeachApiRest.entity.AbecedarioEntity;
import com.example.BrailleTeachApiRest.service.AbecedarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/abecedario")
public class AbecedarioController {

    @Autowired
    private AbecedarioService abecedarioService;

    @GetMapping
    public List<AbecedarioEntity> getAbecedario(){
        return this.abecedarioService.getAbecedario();
    }
    @GetMapping(path = "/{idAbecedario}")
    public Optional<AbecedarioEntity> getAbecedarioById(@PathVariable("idAbecedario") Long id){
        return this.abecedarioService.getAbecedarioById(id);
    }

    @PostMapping
    public AbecedarioEntity saveAbecedario(@RequestBody AbecedarioEntity abecedario){
        return this.abecedarioService.saveAbecedario(abecedario);
    }

    @PutMapping(path = "/{idAbecedario}")
    public AbecedarioEntity updateAbecedarioById(@RequestBody AbecedarioEntity abecedario, @PathVariable("idAbecedario") Long id){
        return this.abecedarioService.updateAbecedarioById(abecedario, id);
    }

    @DeleteMapping(path = "/{idAbecedario}")
    public void deleteAbecedarioById(@PathVariable("idAbecedario") Long id){

        this.abecedarioService.deleteAbecedarioById(id);
    }
}
