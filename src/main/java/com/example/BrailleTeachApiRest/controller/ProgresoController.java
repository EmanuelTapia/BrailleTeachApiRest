package com.example.BrailleTeachApiRest.controller;

import com.example.BrailleTeachApiRest.entity.ProgresoEntity;
import com.example.BrailleTeachApiRest.service.ProgresoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/progreso")

public class ProgresoController {

    @Autowired
    private ProgresoService progresoService;

    @GetMapping
    public List<ProgresoEntity> getProgreso(){
        return this.progresoService.getProgreso();
    }

    @GetMapping(path = "/{idProgreso}")
    public Optional<ProgresoEntity> getProgresoById(@PathVariable("idProgreso") Long id){ return this.progresoService.getProgresoById(id);
    }

    @PostMapping
    public ProgresoEntity saveProgreso(@RequestBody ProgresoEntity progreso){ return this.progresoService.saveProgreso(progreso);
    }

    @PutMapping(path = "/{idProgreso}")
    public ProgresoEntity updateProgresoById(@RequestBody ProgresoEntity progreso, @PathVariable("idProgreso") Long id){
        return this.progresoService.updateProgresoById(progreso, id);
    }

    @DeleteMapping(path = "/{idProgreso}")
    public void deleteProgresoById(@PathVariable("idProgreso") Long id){
        this.progresoService.deleteProgresoById(id);
    }
}
