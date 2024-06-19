package com.example.BrailleTeachApiRest.repository;

import com.example.BrailleTeachApiRest.entity.MinijuegoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MinijuegoRepository extends JpaRepository<MinijuegoEntity,Long> {
}
