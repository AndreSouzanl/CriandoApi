package com.andre.estudocaso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andre.estudocaso.entity.UsuarioEntity;
import com.andre.estudocaso.service.UsuarioService;

@RestController
@RequestMapping(value="/usuario")
public class UsurarioController {

  @Autowired
  private UsuarioService usuarioService;

  @PostMapping
  public void inserirUsuario(@RequestBody UsuarioEntity usuario){
    usuarioService.inserirUsuario(usuario);
  }

  @GetMapping
  public List<UsuarioEntity> ListarUsuarios() {
    return usuarioService.listarTodos();
  }
}
