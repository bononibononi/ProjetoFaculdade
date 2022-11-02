package com.bononi.principal.DTO;

import com.bononi.principal.Cadastro;

public class CadastroDTO {

	private Integer Id;
	private String nome;		
	private String endereco;
	//private String cpfOuCnpj;
	private Boolean ativo;
	
	public CadastroDTO(Integer id, String nome, String endereco, Boolean ativo) {
		super();
		Id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.ativo = ativo;
	}

	public CadastroDTO() {
		super();
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
	public CadastroDTO (Cadastro cad) {
		Id = cad.getId();
		nome = cad.getNome();
		endereco = cad.getEndereco();
		ativo = cad.getAtivo();
	}	
}