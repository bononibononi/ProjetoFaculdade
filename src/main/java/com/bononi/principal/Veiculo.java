package com.bononi.principal;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bononi.servicostaxas.Taxaservicos;

@Entity
@Table(name = "veiculo")
public class Veiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	private String marca;
	private String modelo;
	private String acessorios;
	
	private Date inicio; 
	private Date devolucao;
	@OneToOne(mappedBy = "veiculo", cascade = CascadeType.ALL)
	private Fatura fatura;
	private Double precoPorDia;
	private Double precoPorHora;
	private Taxaservicos taxaServico;
	private Double pagamentoBasico;
	private Double taxa;
	
	public Veiculo() {
		super();
	}

	public Veiculo(Integer id, String marca, String modelo, String acessorios, Date inicio, Date devolucao,
			Fatura fatura, Double precoPorDia, Double precoPorHora, Taxaservicos taxaServico, Double pagamentoBasico,
			Double taxa) {
		super();
		Id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.acessorios = acessorios;
		this.inicio = inicio;
		this.devolucao = devolucao;
		this.fatura = fatura;
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.taxaServico = taxaServico;
		this.pagamentoBasico = pagamentoBasico;
		this.taxa = taxa;
	}

	@Override
	public String toString() {
		return "Veiculo [Id=" + Id + ", marca=" + marca + ", modelo=" + modelo + ", acessorios=" + acessorios
				+ ", inicio=" + inicio + ", devolucao=" + devolucao + ", fatura=" + fatura + ", precoPorDia="
				+ precoPorDia + ", precoPorHora=" + precoPorHora + ", taxaServico=" + taxaServico + ", pagamentoBasico="
				+ pagamentoBasico + ", taxa=" + taxa + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id, acessorios, devolucao, fatura, inicio, marca, modelo, pagamentoBasico, precoPorDia,
				precoPorHora, taxa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		return Objects.equals(Id, other.Id) && Objects.equals(acessorios, other.acessorios)
				&& Objects.equals(devolucao, other.devolucao) && Objects.equals(fatura, other.fatura)
				&& Objects.equals(inicio, other.inicio) && Objects.equals(marca, other.marca)
				&& Objects.equals(modelo, other.modelo) && Objects.equals(pagamentoBasico, other.pagamentoBasico)
				&& Objects.equals(precoPorDia, other.precoPorDia) && Objects.equals(precoPorHora, other.precoPorHora)
				&& Objects.equals(taxa, other.taxa);
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

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getDevolucao() {
		return devolucao;
	}

	public void setDevolucao(Date devolucao) {
		this.devolucao = devolucao;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}

	public Double getPrecoPorDia() {
		return precoPorDia;
	}

	public void setPrecoPorDia(Double precoPorDia) {
		this.precoPorDia = precoPorDia;
	}

	public Double getPrecoPorHora() {
		return precoPorHora;
	}

	public void setPrecoPorHora(Double precoPorHora) {
		this.precoPorHora = precoPorHora;
	}

	public Taxaservicos getTaxaServico() {
		return taxaServico;
	}

	public void setTaxaServico(Taxaservicos taxaServico) {
		this.taxaServico = taxaServico;
	}

	public Double getPagamentoBasico() {
		return pagamentoBasico;
	}

	public void setPagamentoBasico(Double pagamentoBasico) {
		this.pagamentoBasico = pagamentoBasico;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
}