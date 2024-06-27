package com.example.BrailleTeachApiRest.controller;


import com.example.BrailleTeachApiRest.entity.PracticarEntity;
import com.example.BrailleTeachApiRest.service.PracticarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("/practicar")
public class PracticarController {
    @Autowired
    private PracticarService practicarService;

    @GetMapping
    public List<PracticarEntity> getPracticar(){
        return this.practicarService.getPracticar();
    }

    @GetMapping(path = "/{idPracticar}")
    public Optional<PracticarEntity> getPracticarById(@PathVariable("idPracticar") Long id){
        return this.practicarService.getPracticarById(id);
    }

    @PostMapping
    public PracticarEntity savePracticar(@RequestBody PracticarEntity practicar){
        return this.practicarService.savePracticar(practicar);
    }

    @PutMapping(path = "/{idPracticar}")
    public PracticarEntity updatePracticarById(@RequestBody PracticarEntity practicar, @PathVariable("idPracticar") Long id){
        return this.practicarService.updatePracticarById(practicar, id);
    }

    @DeleteMapping(path = "/{idPracticar}")
    public void deletePracticarById(@PathVariable("idPracticar") Long id){

        this.practicarService.deletePracticarById(id);
    }
}
