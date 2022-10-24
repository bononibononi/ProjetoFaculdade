package com.bononi.aluguel;

import java.util.Objects;

import com.bononi.servicostaxas.Taxasbrasil;

public class Fatura {

	private Double pagamentoBasico;
	private Double taxa;
	
	public Fatura() {
		super();
	}

	public Fatura(Double pagamentoBasico, Double taxa) {
		super();
		this.pagamentoBasico = pagamentoBasico;
		this.taxa = taxa;
	}

	public Fatura(double pagamentoBasico, Taxasbrasil taxa) {
		
	}

	@Override
	public String toString() {
		return "Fatura [pagamentoBasico=" + pagamentoBasico + ", taxa=" + taxa + "]";
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
	
	public Double getTotalPagamento() {
		return getPagamentoBasico() + getTaxa();
	}

	@Override
	public int hashCode() {
		return Objects.hash(pagamentoBasico, taxa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fatura other = (Fatura) obj;
		return Objects.equals(pagamentoBasico, other.pagamentoBasico) && Objects.equals(taxa, other.taxa);
	}	
}