package com.bononi.principal;

import java.util.Date;

public class Aluguelcarro {

	private Date inicio; 
	private Date devolucao;
	private Veiculo veiculo; 
	private Fatura fatura;


	public Aluguelcarro() {
		super();
	}


	public Aluguelcarro(Date inicio, Date devolucao, Veiculo veiculo) {
		super();
		this.inicio = inicio;
		this.devolucao = devolucao;
		this.veiculo = veiculo;					
	}
// a fatura fica de fora, pois pode não ter sido processada


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


	public Veiculo getVeiculo() {
		return veiculo;
	}


	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}


	public Fatura getFatura() {
		return fatura;
	}


	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}	
}