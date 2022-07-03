package com.Api.ApiRest.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Veiculo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String marca;
	private String modelo;
	private String placa;
	private int ano;
	private int anoModelo;
	
	@ManyToOne
	@JoinColumn(name = "donoCarro_id")
	private Pessoa donoCarro;

	
	public Veiculo() {
		
	}


	public Veiculo(Long id, String marca, String modelo, String placa, int ano, int anoModelo, Pessoa donoCarro) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
		this.anoModelo = anoModelo;
		this.donoCarro = donoCarro;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public int getAnoModelo() {
		return anoModelo;
	}


	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}


	public Pessoa getDonoCarro() {
		return donoCarro;
	}


	public void setDonoCarro(Pessoa donoCarro) {
		this.donoCarro = donoCarro;
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
		Veiculo other = (Veiculo) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
