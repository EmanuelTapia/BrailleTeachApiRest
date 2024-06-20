package com.example.BrailleTeachApiRest.controller;

import com.example.BrailleTeachApiRest.entity.CuentoEntity;
import com.example.BrailleTeachApiRest.service.CuentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cuento")

public class CuentoController {

    @Autowired
    private CuentoService cuentoService;

    @GetMapping
    public List<CuentoEntity> getCuento(){
        return this.cuentoService.getCuento();
    }

    @GetMapping(path = "/{idCuento}")
    public Optional<CuentoEntity> getCuentoById(@PathVariable("idCuento") Long id){
        return this.cuentoService.getCuentoById(id);
    }

    @PostMapping
    public CuentoEntity saveCuento(@RequestBody CuentoEntity cuento) {
        return this.cuentoService.saveCuento(cuento);
    }

    @PutMapping(path = "/{idCuento}")
    public CuentoEntity updateCuento(@RequestBody CuentoEntity cuento, @PathVariable("idCuento") Long id){
        return this.cuentoService.updateLaberintoById(cuento, id);
    }

    @DeleteMapping(path = "/{idCuento}")
    public void deleteCuentoById(@PathVariable("idCuento") Long id){
        this.cuentoService.deleteCuentoById(id);
    }

}
