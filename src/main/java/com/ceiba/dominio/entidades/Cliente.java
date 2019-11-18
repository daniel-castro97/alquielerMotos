package com.ceiba.dominio.entidades;

import java.util.Date;

public class Cliente {

	private int cedula;
	private String nombre;
	private Date fechaNacimineto;
	private Long telefono;
	private String correo;
	private String categoriaPase;
	
	public Cliente(int cedula, String nombre, Date fechaNacimineto, Long telefono, String correo,
			String categoriaPase) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.fechaNacimineto = fechaNacimineto;
		this.telefono = telefono;
		this.correo = correo;
		this.categoriaPase = categoriaPase;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimineto() {
		return fechaNacimineto;
	}

	public void setFechaNacimineto(Date fechaNacimineto) {
		this.fechaNacimineto = fechaNacimineto;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCategoriaPase() {
		return categoriaPase;
	}

	public void setCategoriaPase(String categoriaPase) {
		this.categoriaPase = categoriaPase;
	}
	
	
}
