package com.bononi.principal.DTO.Insert;

import java.util.Objects;

import com.bononi.principal.Endereco;

public class CadastroInsert {

	private Integer Id;
	private String nome;		
	private Endereco endereco;
	private String cpfOuCnpj;
	private Boolean ativo;
	
	public CadastroInsert() {
		super();
	}

	public CadastroInsert(Integer id, String nome, Endereco endereco, String cpfOuCnpj, Boolean ativo) {
		super();
		Id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.cpfOuCnpj = cpfOuCnpj;
		this.ativo = ativo;
	}

	@Override
	public String toString() {
		return "CadastroInsert [Id=" + Id + ", nome=" + nome + ", endereco=" + endereco + ", cpfOuCnpj=" + cpfOuCnpj
				+ ", ativo=" + ativo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id, ativo, cpfOuCnpj, endereco, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CadastroInsert other = (CadastroInsert) obj;
		return Objects.equals(Id, other.Id) && Objects.equals(ativo, other.ativo)
				&& Objects.equals(cpfOuCnpj, other.cpfOuCnpj) && Objects.equals(endereco, other.endereco)
				&& Objects.equals(nome, other.nome);
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCpfOuCnpj() {
		return cpfOuCnpj;
	}

	public void setCpfOuCnpj(String cpfOuCnpj) {
		this.cpfOuCnpj = cpfOuCnpj;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}	
}