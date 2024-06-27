package com.example.BrailleTeachApiRest.controller;

import com.example.BrailleTeachApiRest.entity.InsigniaEntity;
import com.example.BrailleTeachApiRest.service.InsigniaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("/insignia")

public class InsigniaController {

    @Autowired
    private InsigniaService insigniaService;

    @GetMapping
    public List<InsigniaEntity> getInsignia(){
        return this.insigniaService.getInsignia();
    }

    @GetMapping(path = "/{idInsignia}")
    public Optional<InsigniaEntity> getInsigniaById(@PathVariable("idInsignia") Long id){ return this.insigniaService.getInsigniaById(id);
    }

    @PostMapping
    public InsigniaEntity saveInsignia(@RequestBody InsigniaEntity insignia){
        return this.insigniaService.saveInsignia(insignia);
    }

    @PutMapping(path = "/{idInsignia}")
    public InsigniaEntity updateInsigniaById(@RequestBody InsigniaEntity insignia, @PathVariable("idInsignia") Long id){
        return this.insigniaService.updateInsigniaById(insignia, id);
    }

    @DeleteMapping(path = "/{idInsignia}")
    public void deleteInsigniaById(@PathVariable("idInsignia") Long id){
        this.insigniaService.deleteInsigniaById(id);
    }
}
