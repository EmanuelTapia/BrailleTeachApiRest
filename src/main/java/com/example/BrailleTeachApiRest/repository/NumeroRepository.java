package com.example.BrailleTeachApiRest.repository;

import com.example.BrailleTeachApiRest.entity.NumeroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NumeroRepository extends JpaRepository<NumeroEntity,Long> {
}
