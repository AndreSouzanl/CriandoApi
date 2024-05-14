 package com.andre.estudocaso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andre.estudocaso.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

  
}