package com.andre.estudocaso.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class UsuarioEntity {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nome;
    private String email;
    private String senha;

  public UsuarioEntity(UsuarioEntity usuario){
    
  }
  
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  
  }
  public void setSenha(String telefone) {
    this.senha = telefone;
  }

  public String getSenha() {
    return senha;
  }
 
  
}
