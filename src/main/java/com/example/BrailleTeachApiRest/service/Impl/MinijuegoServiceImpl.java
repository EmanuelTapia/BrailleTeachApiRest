package com.example.BrailleTeachApiRest.service.Impl;

import com.example.BrailleTeachApiRest.entity.MinijuegoEntity;
import com.example.BrailleTeachApiRest.repository.MinijuegoRepository;
import com.example.BrailleTeachApiRest.service.MinijuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MinijuegoServiceImpl implements MinijuegoService {

    @Autowired
    private MinijuegoRepository minijuegoRepository;

    @Override
    public List<MinijuegoEntity> getMinijuego() {
        return this.minijuegoRepository.findAll();
    }

    @Override
    public Optional<MinijuegoEntity> getMinijuegoById(Long id) {
        return this.minijuegoRepository.findById(id);
    }

    @Override
    public MinijuegoEntity saveMinijuego(MinijuegoEntity minijuego) {
        return this.minijuegoRepository.save(minijuego);
    }

    @Override
    public MinijuegoEntity updateMinijuegoById(MinijuegoEntity minijuego, Long id) {
        MinijuegoEntity minijuegoEntity = minijuegoRepository.findById(id).get();

        minijuegoEntity.setNombre(minijuego.getNombre());
        minijuegoEntity.setCategoria(minijuego.getCategoria());

        minijuegoRepository.save(minijuegoEntity);

        return minijuegoEntity;
    }

    @Override
    public void deleteMinijuegoById(Long id) {
        this.minijuegoRepository.deleteById(id);
    }
}
