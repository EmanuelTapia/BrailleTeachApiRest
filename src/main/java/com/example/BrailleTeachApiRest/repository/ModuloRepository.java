package com.example.BrailleTeachApiRest.repository;

import com.example.BrailleTeachApiRest.entity.ModuloEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuloRepository extends JpaRepository<ModuloEntity,Long> {
}
