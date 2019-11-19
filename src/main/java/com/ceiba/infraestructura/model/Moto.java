package com.ceiba.infraestructura.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOTOS")
public class Moto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "placa")
	private String placa;
	
	@Column(name = "marca")
	private String marca;
	
	@Column(name = "anio_modelo")
	private int anioModelo;
	
	@Column(name = "referencia")
	private String referencia;
	
	@Column(name = "cilindrada")
	private int cilindrada;
	
	@Column(name = "precio_alquiler")
	private int precioAlquiler;
}
