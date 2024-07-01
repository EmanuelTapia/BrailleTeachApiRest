package com.example.BrailleTeachApiRest.controller;

import com.example.BrailleTeachApiRest.entity.OperacionMatematicaEntity;
import com.example.BrailleTeachApiRest.service.OperacionMatematicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("/operacionmatematica")

public class OperacionMatematicaController {

    @Autowired
    private OperacionMatematicaService operacionMatematicaService;

    @GetMapping
    public List<OperacionMatematicaEntity> getOperacionMatematica(){
        return this.operacionMatematicaService.getOperacionMatematica();
    }

    @GetMapping(path = "/{idOperacionMatematica}")
    public Optional<OperacionMatematicaEntity> getOperacionMatematicaById(@PathVariable("idOperacionMatematica") Long id){
        return this.operacionMatematicaService.getOperacionMatematicaById(id);
    }

    @PostMapping
    public OperacionMatematicaEntity saveOperacionMetematica(@RequestBody OperacionMatematicaEntity operacionMatematica){
        return this.operacionMatematicaService.saveOperacionMatematica(operacionMatematica);
    }

    @PutMapping(path = "/{idOperacionMatematica}")
    public OperacionMatematicaEntity updateOperacionMatematica(@RequestBody OperacionMatematicaEntity operacionMatematica, @PathVariable("idOperacionMatematica") Long id){
        return this.operacionMatematicaService.updateOperacionMatematicaById(operacionMatematica, id);
    }

    @DeleteMapping(path = "/{idOperacionMatematica}" )
    public void deleteOperacionMatematicaById(@PathVariable("idOperacionMatematica") Long id){
        this.operacionMatematicaService.deleteOperacionMatematicaById(id);
    }
}
