package com.bononi.principal.DTO;

public class UsuarioNewDTO {

	private Integer Id;
	private String nome;
	private String email;
	private String senha;
	
	public UsuarioNewDTO() {
		super();
	}

	public UsuarioNewDTO(Integer id, String nome, String email, String senha) {
		super();
		Id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
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
}