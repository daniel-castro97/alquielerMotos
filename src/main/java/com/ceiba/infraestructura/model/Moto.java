package com.ceiba.infraestructura.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "moto")
public class Moto {

	@Id
	@Column(name = "placa")
	private int placa;
	
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
