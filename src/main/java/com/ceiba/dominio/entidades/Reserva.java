package com.ceiba.dominio.entidades;

import java.util.Date;

/**
 * Clase que define los atributos del objeto Reserva
 * @author daniel.castro
 *
 */
public class Reserva {
	//Atributos de Reserva
	private int id;
	private Date fechaSolicitud;
	private Date fechaInicio;
	private Date fechaFin;
	private int valorTotal;
	private Moto moto;
	private Cliente cliente;
	
	/**
	 * Constructor
	 * @param id
	 * @param fechaSolicitud
	 * @param fechaInicio
	 * @param fechaFin
	 * @param valorTotal
	 * @param moto
	 * @param cliente
	 */
	public Reserva(int id, Date fechaSolicitud, Date fechaInicio, Date fechaFin, int valorTotal, Moto moto,
			Cliente cliente) {
		super();
		this.id = id;
		this.fechaSolicitud = fechaSolicitud;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.valorTotal = valorTotal;
		this.moto = moto;
		this.cliente = cliente;
	}
	/**
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}
	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 
	 * @return
	 */
	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}
	/**
	 * 
	 * @param fechaSolicitud
	 */
	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}
	/**
	 * 
	 * @return
	 */
	public Date getFechaInicio() {
		return fechaInicio;
	}
	/**
	 * 
	 * @param fechaInicio
	 */
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	/**
	 * 
	 * @return
	 */
	public Date getFechaFin() {
		return fechaFin;
	}
	/**
	 * 
	 * @param fechaFin
	 */
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	/**
	 * 
	 * @return
	 */
	public int getValorTotal() {
		return valorTotal;
	}
	/**
	 * 
	 * @param valorTotal
	 */
	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}
	/**
	 * 
	 * @return
	 */
	public Moto getMoto() {
		return moto;
	}
	/**
	 * 
	 * @param moto
	 */
	public void setMoto(Moto moto) {
		this.moto = moto;
	}
	/**
	 * 
	 * @return
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * 
	 * @param cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
