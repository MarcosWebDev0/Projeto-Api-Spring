package com.Api.ApiRest.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Vaga implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numeroVaga;
	
	@OneToOne
	@JoinColumn(name = "pessoa_id")
	private Pessoa pessoa;
	
	
	@OneToOne
	@JoinColumn(name = "veiculo_id")
	private Veiculo veiculos;
	
	public Vaga() {
		
	}

	public Vaga(Long numeroVaga, Pessoa pessoa, Veiculo veiculos) {
		super();
		this.numeroVaga = numeroVaga;
		this.pessoa = pessoa;
		this.veiculos = veiculos;
	}

	public Long getNumeroVaga() {
		return numeroVaga;
	}

	public void setNumeroVaga(Long numeroVaga) {
		this.numeroVaga = numeroVaga;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Veiculo getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(Veiculo veiculos) {
		this.veiculos = veiculos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroVaga);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vaga other = (Vaga) obj;
		return numeroVaga == other.numeroVaga;
	}
	
	
}
