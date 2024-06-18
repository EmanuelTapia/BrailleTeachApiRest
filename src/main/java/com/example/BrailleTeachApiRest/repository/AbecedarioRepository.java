package com.example.BrailleTeachApiRest.repository;

import com.example.BrailleTeachApiRest.entity.AbecedarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbecedarioRepository extends JpaRepository<AbecedarioEntity,Long> {
}
