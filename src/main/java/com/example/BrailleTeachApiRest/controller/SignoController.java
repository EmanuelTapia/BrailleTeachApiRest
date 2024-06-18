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
    private SignoService sygnosService;

    @GetMapping
    public List<SignoEntity> getSignos(){return this.sygnosService.getSignos();
    }

    @GetMapping(path = "/{idSigno}")
    public Optional<SignoEntity> getSignosById(@PathVariable("idSigno") Long id){ return this.sygnosService.getSygnosById(id);
    }

    @PostMapping
    public SignoEntity saveSignos(@RequestBody SignoEntity signos){
        return this.sygnosService.saveSignos(signos);
    }

    @PutMapping(path = "/{idSignos}")
    public SignoEntity updateSignosById(@RequestBody SignoEntity signos, @PathVariable("idSignos") Long id){
        return this.sygnosService.updateSignosById(signos, id);
    }

    @DeleteMapping(path = "/{idSignos}")
    public void deleteSignosById(@PathVariable("idSignos") Long id){
        this.sygnosService.deleteSignosById(id);
    }
}
