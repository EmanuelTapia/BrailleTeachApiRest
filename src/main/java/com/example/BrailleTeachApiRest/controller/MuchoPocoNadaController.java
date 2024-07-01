package com.example.BrailleTeachApiRest.controller;


import com.example.BrailleTeachApiRest.entity.MuchoPocoNadaEntity;
import com.example.BrailleTeachApiRest.service.MuchoPocoNadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("/muchopoconada")
public class MuchoPocoNadaController {

    @Autowired
    private MuchoPocoNadaService muchoPocoNadaService;

    @GetMapping
    public List<MuchoPocoNadaEntity> getMuchoPocoNada(){
        return this.muchoPocoNadaService.getMuchoPocoNada();
    }

    @GetMapping(path = "/{idMuchoPocoNada}")
    public Optional<MuchoPocoNadaEntity> getMuchoPocoNadaById(@PathVariable("idMuchoPocoNada") Long id){
        return this.muchoPocoNadaService.getMuchoPocoNadaById(id);
    }

    @PostMapping
    public MuchoPocoNadaEntity saveMuchoPocoNada(@RequestBody MuchoPocoNadaEntity muchoPocoNada) {
        return this.muchoPocoNadaService.saveMuchoPocoNada(muchoPocoNada);
    }

    @PutMapping(path = "/{idMuchoPocoNada}")
    public MuchoPocoNadaEntity updateMuchoPocoNada(@RequestBody MuchoPocoNadaEntity muchoPocoNada, @PathVariable("idMuchoPocoNada") Long id){
        return this.muchoPocoNadaService.updateMuchoPocoNadaById(muchoPocoNada, id);
    }

    @DeleteMapping(path = "/{idMuchoPocoNada}")
    public void deleteMuchoPocoNadaById(@PathVariable("idMuchoPocoNada") Long id){
        this.muchoPocoNadaService.deleteMuchoPocoNadaById(id);
    }
}
