package com.example.BrailleTeachApiRest.repository;

import com.example.BrailleTeachApiRest.entity.OperacionMatematicaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperacionMatematicaRepository extends JpaRepository<OperacionMatematicaEntity,Long> {
}
