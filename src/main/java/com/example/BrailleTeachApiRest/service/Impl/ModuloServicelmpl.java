package com.example.BrailleTeachApiRest.service.Impl;

import com.example.BrailleTeachApiRest.entity.ModuloEntity;
import com.example.BrailleTeachApiRest.repository.ModuloRepository;
import com.example.BrailleTeachApiRest.service.ModuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModuloServicelmpl implements ModuloService {

    @Autowired
    private ModuloRepository moduloRepository;

    @Override
    public List<ModuloEntity> getModulo() {
        return this.moduloRepository.findAll();
    }

    @Override
    public Optional<ModuloEntity> getModuloById(Long id) {
        return this.moduloRepository.findById(id);
    }

    @Override
    public ModuloEntity saveModulo(ModuloEntity modulo) {
        return this.moduloRepository.save(modulo);
    }

    @Override
    public ModuloEntity updateModuloById(ModuloEntity modulo, Long id) {

        ModuloEntity moduloEntity=moduloRepository.findById(id).get();

        moduloEntity.setIdAprender(modulo.getIdAprender());
        moduloEntity.setIdPracticar(modulo.getIdPracticar());
        moduloEntity.setIdMinijuego(modulo.getIdMinijuego());
        moduloRepository.save(moduloEntity);
        return moduloEntity;
    }

    @Override
    public void deleteModuloById(Long id) {
        this.moduloRepository.deleteById(id);

    }
}
