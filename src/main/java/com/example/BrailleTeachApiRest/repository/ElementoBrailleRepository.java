package com.example.BrailleTeachApiRest.repository;

import com.example.BrailleTeachApiRest.entity.ElementoBrailleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementoBrailleRepository extends JpaRepository<ElementoBrailleEntity,Long> {
}
