package com.example.BrailleTeachApiRest.repository;

import com.example.BrailleTeachApiRest.entity.InsigniaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsigniaRepository extends JpaRepository<InsigniaEntity,Long> {

}
