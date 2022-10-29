package com.bononi.principal.DTO;

import java.io.Serializable;

import com.bononi.principal.Endereco;

public class EnderecoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer Id;
	private String logradouro;
	private String numero; 
	private String bairro; 
	private String complemento;
	private String cep; 
	private String cidade; 
	private String estado;
	
	
	public EnderecoDTO() {
		super();
	}

	public EnderecoDTO(Integer id, String logradouro, String numero, String bairro, String complemento, String cep,
			String cidade, String estado) {
		super();
		Id = id;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public EnderecoDTO (Endereco endere) {
		Id = endere.getId();
		logradouro = endere.getLogradouro();
		numero = endere.getNumero();
		bairro = endere.getBairro();
		complemento = endere.getComplemento();
		cep = endere.getCep();
		cidade = endere.getCidade();
		estado = endere.getEstado();
	}
}