package com.example.BrailleTeachApiRest.service.Impl;

import com.example.BrailleTeachApiRest.entity.PracticarEntity;
import com.example.BrailleTeachApiRest.repository.PracticarRepository;
import com.example.BrailleTeachApiRest.service.PracticarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PracticarServicelmpl implements PracticarService {

   @Autowired
   private PracticarRepository practicarRepository;

    @Override
    public List<PracticarEntity> getPracticar() {
        return this.practicarRepository.findAll();
    }

    @Override
    public Optional<PracticarEntity> getPracticarById(Long id) {
        return this.practicarRepository.findById(id);
    }

    @Override
    public PracticarEntity savePracticar(PracticarEntity practicar) {
        return this.practicarRepository.save(practicar);
    }

    @Override
    public PracticarEntity updatePracticarById(PracticarEntity practicar, Long id) {
        PracticarEntity practicarEntity=practicarRepository.findById(id).get();

        practicarEntity.setIdElementoBraille(practicar.getIdElementoBraille());
        practicarEntity.setEjercicio_voz(practicar.getEjercicio_voz());

        practicarRepository.save(practicarEntity);

        return practicarEntity;
    }

    @Override
    public void deletePracticarById(Long id) {
        this.practicarRepository.deleteById(id);

    }
}
