package com.example.BrailleTeachApiRest.repository;

import com.example.BrailleTeachApiRest.entity.ProgresoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgresoRepository extends JpaRepository<ProgresoEntity,Long>{

}
