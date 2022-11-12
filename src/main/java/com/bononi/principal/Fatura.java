package com.bononi.principal;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "fatura")
public class Fatura implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private static final long serialVersionUID = 1L;
	private Long id;
	private Instant moment;
	@OneToOne
	@MapsId
	private Veiculo veiculo;
	
	public Fatura() {
		super();
	}

	public Fatura(Long id, Instant moment, Fatura fatura, Veiculo veiculo) {
		super();
		this.id = id;
		this.moment = moment;
		this.veiculo = veiculo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return Objects.equals(id, other.id);
	}	
}