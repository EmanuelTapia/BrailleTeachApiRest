package com.example.BrailleTeachApiRest.controller;

import com.example.BrailleTeachApiRest.entity.AulaEntity;
import com.example.BrailleTeachApiRest.service.AulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/aula")
public class AulaController {

    @Autowired
    private AulaService aulaService;

    @GetMapping
    public List<AulaEntity> getAula(){
        return this.aulaService.getAula();
    }

    @GetMapping(path = "/{idAula}")
    public Optional<AulaEntity> getAulaById(@PathVariable("idAula") Long id){ return this.aulaService.getAulaById(id);
    }

    @PostMapping
    public AulaEntity saveAula(@RequestBody AulaEntity aula){
        return this.aulaService.saveAula(aula);
    }

    @PutMapping(path = "/{idAula}")
    public AulaEntity updateAulaById(@RequestBody AulaEntity aula, @PathVariable("idAula") Long id){
        return this.aulaService.updateAulaById(aula, id);
    }

    @DeleteMapping(path = "/{idAula}")
    public void deleteAulaById(@PathVariable("idAula") Long id){
        this.aulaService.deleteAulaById(id);
    }

}
