package com.example.BrailleTeachApiRest.controller;

import com.example.BrailleTeachApiRest.entity.SignoEntity;
import com.example.BrailleTeachApiRest.service.SignoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/signo")
public class SignoController {

    @Autowired
    private SignoService signoService;

    @GetMapping
    public List<SignoEntity> getSignos(){
        return this.signoService.getSigno();
    }

    @GetMapping(path = "/{idSigno}")
    public Optional<SignoEntity> getSignoById(@PathVariable("idSigno") Long id){
        return this.signoService.getSignoById(id);
    }

    @PostMapping
    public SignoEntity saveSigno(@RequestBody SignoEntity signo){
        return this.signoService.saveSigno(signo);
    }

    @PutMapping(path = "/{idSigno}")
    public SignoEntity updateSignoById(@RequestBody SignoEntity signo, @PathVariable("idSigno") Long id){
        return this.signoService.updateSignoById(signo, id);
    }

    @DeleteMapping(path = "/{idSigno}")
    public void deleteSignoById(@PathVariable("idSigno") Long id){
        this.signoService.deleteSignoById(id);
    }
}
