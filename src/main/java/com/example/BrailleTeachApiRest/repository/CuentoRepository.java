package com.example.BrailleTeachApiRest.repository;

import com.example.BrailleTeachApiRest.entity.CuentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentoRepository extends JpaRepository<CuentoEntity, Long> {
}
