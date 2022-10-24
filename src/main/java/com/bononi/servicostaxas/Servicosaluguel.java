package com.bononi.servicostaxas;

import com.bononi.aluguel.Aluguelcarro;
import com.bononi.aluguel.Fatura;

public class Servicosaluguel {

	private Double precoPorDia;
	private Double precoPorHora;
	private Taxaservicos taxaServico;
	
	public Servicosaluguel() {
		super();
	}

	public Servicosaluguel(Double precoPorDia, Double precoPorHora, Taxaservicos taxaServico) {
		super();
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.taxaServico = taxaServico;
	}
	
	public void processoFatura(Aluguelcarro aluguelCarro) {
		long retirada = aluguelCarro.getInicio().getTime();
		long devolucao = aluguelCarro.getDevolucao().getTime();
		double horas = (double)(devolucao - retirada)/1000/60/60;		// para ter a diferença em milissegundos para segundo divide por 1000, para ter a diferença em segundos e converter para minutos divide por 60 e para converter os minutos em horas divide por 60.
	
		double pagamentoBasico;
		if (horas <=12.0) {
			pagamentoBasico = Math.ceil(horas) * precoPorHora;
		} else {
			pagamentoBasico = Math.ceil(horas/24) * precoPorDia;
		}
		
		double taxaCobrada = taxaServico.taxa(pagamentoBasico);
		aluguelCarro.setFatura(new Fatura(pagamentoBasico, taxaCobrada));
	}	
}