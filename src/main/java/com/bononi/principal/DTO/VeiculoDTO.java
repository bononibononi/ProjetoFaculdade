package com.bononi.principal.DTO;

import java.io.Serializable;

import com.bononi.aluguel.Veiculo;

public class VeiculoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer Id;
	private String marca;
	private String modelo;
	private String acessorios;
	
	public VeiculoDTO() {
		super();
	}

	public VeiculoDTO(Integer id, String marca, String modelo, String acessorios) {
		super();
		Id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.acessorios = acessorios;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(String acessorios) {
		this.acessorios = acessorios;
	}
	
	public VeiculoDTO(Veiculo veic) {
		Id = veic.getId();
		marca = veic.getMarca();
		modelo = veic.getModelo();
		acessorios = veic.getAcessorios();
	}
}
