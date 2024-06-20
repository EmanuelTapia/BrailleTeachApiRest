package com.example.BrailleTeachApiRest.repository;

import com.example.BrailleTeachApiRest.entity.AprenderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AprenderRepository extends JpaRepository<AprenderEntity,Long> {
}
