package com.bononi.servicostaxas;

public class Taxasbrasil implements Taxaservicos {

	public Double taxa(double amount) {
		if (amount <= 100.0) {
			return amount*0.25;	
		}
		else {
			return amount*0.15;
		}		
	}
}