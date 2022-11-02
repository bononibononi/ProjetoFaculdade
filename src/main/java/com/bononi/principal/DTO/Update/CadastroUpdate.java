package com.bononi.principal.DTO.Update;

import java.io.Serializable;
import java.util.Objects;

import com.bononi.principal.Endereco;

public class CadastroUpdate implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer Id;
	private String nome;		
	private Endereco endereco;
	private String cpfOuCnpj;
	private Boolean ativo;
	
	public String getCpfOuCnpj() {
		return cpfOuCnpj;
	}

	public void setCpfOuCnpj(String cpfOuCnpj) {
		this.cpfOuCnpj = cpfOuCnpj;
	}

	public CadastroUpdate(Endereco endereco) {
		super();
		this.endereco = endereco;
	}

	public CadastroUpdate() {
		super();
	}

	public CadastroUpdate(Integer id, String nome, Endereco endereco, Boolean ativo) {
		super();
		Id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.ativo = ativo;
	}

	@Override
	public String toString() {
		return "CadastroUpdate [Id=" + Id + ", nome=" + nome + ", endereco=" + endereco + ", ativo=" + ativo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id, ativo, endereco, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CadastroUpdate other = (CadastroUpdate) obj;
		return Objects.equals(Id, other.Id) && Objects.equals(ativo, other.ativo)
				&& Objects.equals(endereco, other.endereco) && Objects.equals(nome, other.nome);
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

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
}