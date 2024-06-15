package com.example.BrailleTeachApiRest.repository;

import com.example.BrailleTeachApiRest.entity.AulaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AulaRepository extends JpaRepository<AulaEntity,Long> {
}
