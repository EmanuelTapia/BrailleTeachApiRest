package com.example.BrailleTeachApiRest.repository;

import com.example.BrailleTeachApiRest.entity.SignoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignoRepository extends JpaRepository<SignoEntity,Long>{

}
