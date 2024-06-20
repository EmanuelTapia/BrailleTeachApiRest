package com.example.BrailleTeachApiRest.repository;

import com.example.BrailleTeachApiRest.entity.MuchoPocoNadaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MuchoPocoNadaRepository extends JpaRepository<MuchoPocoNadaEntity,Long> {
}
