package com.example.BrailleTeachApiRest.repository;

import com.example.BrailleTeachApiRest.entity.ProfesorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface ProfesorRepository extends JpaRepository<ProfesorEntity,Long> {
}
