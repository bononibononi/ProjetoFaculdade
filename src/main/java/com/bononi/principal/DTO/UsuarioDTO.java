package com.bononi.principal.DTO;

import java.io.Serializable;

import com.bononi.principal.Usuario;

public class UsuarioDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer Id;
	private String nome;
	private String email;
	private String senha; // verificar se necessário colocar campo senha
	
	public UsuarioDTO() {

	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public UsuarioDTO (Usuario u) {
		Id = u.getId();
		nome = u.getNome();
		email = u.getEmail();
	}
}