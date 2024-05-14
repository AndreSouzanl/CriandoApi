package com.andre.estudocaso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andre.estudocaso.entity.UsuarioEntity;
import com.andre.estudocaso.repository.UsuarioRepository;

@Service
public class UsuarioService {

  @Autowired
  private UsuarioRepository usuarioRepository;

  public void inserirUsuario(UsuarioEntity usuario){
      usuarioRepository.save(usuario);
  }

  public List<UsuarioEntity> listarTodos(){
    return usuarioRepository.findAll();
  }
  
}
