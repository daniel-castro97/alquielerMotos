package com.ceiba.dominio.entidades;

import com.ceiba.dominio.excepcion.ExcepcionValidadorMoto;
/**
 * Clase para realizar validaciones a los datos que se van a insertar a un Objeto moto
 * @author daniel.castro
 *
 */
public class ValidadorMoto {
	/**
	 * Constructor
	 */
	private ValidadorMoto() {
	
	}
	/**
	 * Funcion para validar que el tama�o de una placa de una moto sea exacta
	 * @param valor, valor de placa validar
	 * @param tamanio, tamanio estatico ya definido
	 * @param mensaje, mensaje en caso de excepci�n
	 */
	public static void validarPlaca(String valor, int tamanio, String mensaje) {
		if(valor.length()!=tamanio) {
			throw new ExcepcionValidadorMoto(mensaje);
		}
	}
	/**
	 * Funcion encargada de validar los campos obligatorios
	 * @param valor, campo a ser validado
	 * @param mensaje, mensaje en caso de excepcion
	 */
	public static void validarObligatorio(String valor, String mensaje) {
		if(valor.equals("")) {
			throw new ExcepcionValidadorMoto(mensaje);
		}
	}
	/**
	 * Funcion que valida los campos numericos a ingresar durante el registro de una moto
	 * @param valor, campo a ser validado
	 * @param mensaje, mensaje en caso de excepcion
	 */
	public static void validarEntero(int valor, String mensaje) {
		if(valor==0) {
			throw new ExcepcionValidadorMoto(mensaje);
		}
	}
	

}
