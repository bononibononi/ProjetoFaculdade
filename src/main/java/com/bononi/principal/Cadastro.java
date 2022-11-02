package com.bononi.principal;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cadastro implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	private String nome;		
	private String endereco;
	private String cpfOuCnpj;
	private Boolean ativo;
		
	public Cadastro() {
		super();
		}
	
	public Cadastro(Integer id, String nome, String endereco, Boolean ativo) {
		super();
		Id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.ativo = ativo;
		}

		@Override
		public String toString() {
			return "Cadastro [Id=" + Id + ", nome=" + nome + ", endereco=" + endereco + ", ativo=" + ativo + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(Id);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Cadastro other = (Cadastro) obj;
			return Objects.equals(Id, other.Id);
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

		public String getCpfOuCnpj() {
			return cpfOuCnpj;
		}

		public void setCpfOuCnpj(String cpfOuCnpj) {
			this.cpfOuCnpj = cpfOuCnpj;
		}	
	}