package com.example.BrailleTeachApiRest.controller;

import com.example.BrailleTeachApiRest.entity.ProfesorEntity;
import com.example.BrailleTeachApiRest.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/profesor")

public class ProfesorController {
    @Autowired
    private ProfesorService profesorService;

    @GetMapping
    public List<ProfesorEntity> getProfesor(){ return this.profesorService.getProfesor();
    }

    @GetMapping(path = "/{idProfesor}")
    public Optional<ProfesorEntity> getProfesorById(@PathVariable("idProfesor") Long id){ return this.profesorService.getProfesorById(id);
    }

    @PostMapping
    public ProfesorEntity saveProfesor(@RequestBody ProfesorEntity profesor){ return this.profesorService.saveProfesor(profesor);
    }

    @PutMapping(path = "/{idProfesor}")
    public ProfesorEntity updateProfesorById(@RequestBody ProfesorEntity profesor, @PathVariable("idProfesor") Long id){
        return this.profesorService.updateProfesorById(profesor, id);
    }

    @DeleteMapping(path = "/{idProfesor}")
    public void deleteProfesorById(@PathVariable("idProfesor") Long id){
        this.profesorService.deleteProfesorById(id);
    }
}
