package com.example.BrailleTeachApiRest.repository;

import com.example.BrailleTeachApiRest.entity.LaberintoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaberintoRepository extends JpaRepository<LaberintoEntity,Long> {
}
