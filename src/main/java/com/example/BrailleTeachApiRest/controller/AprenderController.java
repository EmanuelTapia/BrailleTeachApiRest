package com.example.BrailleTeachApiRest.controller;


import com.example.BrailleTeachApiRest.entity.AprenderEntity;
import com.example.BrailleTeachApiRest.service.AprenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("/aprender")
public class AprenderController {

    @Autowired
    private AprenderService aprenderService;

    @GetMapping
    public List<AprenderEntity> getAprender(){
        return this.aprenderService.getAprender();
    }

    @GetMapping(path = "/{idAprender}")
    public Optional<AprenderEntity> getAprenderById(@PathVariable("idAprender") Long id){
        return this.aprenderService.getAprenderById(id);
    }

    @PostMapping
    public AprenderEntity saveAprender(@RequestBody AprenderEntity aprender){
        return this.aprenderService.saveAprender(aprender);
    }

    @PutMapping(path = "/{idAprender}")
    public AprenderEntity updateAprenderById(@RequestBody AprenderEntity aprender, @PathVariable("idAprender") Long id){
        return this.aprenderService.updateAprenderById(aprender, id);
    }

    @DeleteMapping(path = "/{idAprender}")
    public void deleteAprenderById(@PathVariable("idAprender") Long id){

        this.aprenderService.deleteAprenderById(id);
    }
}
