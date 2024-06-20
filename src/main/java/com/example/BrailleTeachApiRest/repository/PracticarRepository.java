package com.example.BrailleTeachApiRest.repository;


import com.example.BrailleTeachApiRest.entity.PracticarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PracticarRepository extends JpaRepository<PracticarEntity,Long> {
}
