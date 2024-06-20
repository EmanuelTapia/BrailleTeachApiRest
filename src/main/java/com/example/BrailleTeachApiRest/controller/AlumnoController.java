package com.example.BrailleTeachApiRest.controller;

import com.example.BrailleTeachApiRest.entity.AlumnoEntity;
import com.example.BrailleTeachApiRest.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alumno")

public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping
    public List<AlumnoEntity> getAlumno(){
        return this.alumnoService.getAlumno();
    }

    @GetMapping(path = "/{idAlumno}")
    public Optional<AlumnoEntity> getAlumnoById(@PathVariable("idAlumno") Long id){ return this.alumnoService.getAlumnoById(id);
    }

    @PostMapping
    public AlumnoEntity saveAlumno(@RequestBody AlumnoEntity alumno){ return this.alumnoService.saveAlumno(alumno);
    }

    @PutMapping(path = "/{idAlumno}")
    public AlumnoEntity updateAlumnoById(@RequestBody AlumnoEntity alumno, @PathVariable("idAlumno") Long id){
        return this.alumnoService.updateAlumnoById(alumno, id);
    }

    @DeleteMapping(path = "/{idAlumno}")
    public void deleteAlumnoById(@PathVariable("idAlumno") Long id){
        this.alumnoService.deleteAlumnoById(id);
    }
}
