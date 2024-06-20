package com.example.BrailleTeachApiRest.repository;

import com.example.BrailleTeachApiRest.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity,Long>  {
}
