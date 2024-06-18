package com.example.BrailleTeachApiRest.service.Impl;

import com.example.BrailleTeachApiRest.entity.AbecedarioEntity;
import com.example.BrailleTeachApiRest.repository.AbecedarioRepository;
import com.example.BrailleTeachApiRest.service.AbecedarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AbecedarioServicelmpl implements AbecedarioService {

    @Autowired
    private AbecedarioRepository abecedarioRepository;

    @Override
    public List<AbecedarioEntity> getAbecedario() {
        return this.abecedarioRepository.findAll();
    }

    @Override
    public Optional<AbecedarioEntity> getAbecedarioById(Long id) {
        return this.abecedarioRepository.findById(id);
    }

    @Override
    public AbecedarioEntity saveAbecedario(AbecedarioEntity abecedario) {
        return this.abecedarioRepository.save(abecedario);
    }

    @Override
    public AbecedarioEntity updateAbecedarioById(AbecedarioEntity abecedario, Long id) {
        AbecedarioEntity abecedarioEntity=abecedarioRepository.findById(id).get();

        abecedarioEntity.setCodigo(abecedario.getCodigo());
        abecedarioEntity.setLetra(abecedario.getLetra());

        abecedarioRepository.save(abecedarioEntity);
        return abecedarioEntity;
    }

    @Override
    public void deleteAbecedarioById(Long id) {
        this.abecedarioRepository.deleteById(id);

    }
}
