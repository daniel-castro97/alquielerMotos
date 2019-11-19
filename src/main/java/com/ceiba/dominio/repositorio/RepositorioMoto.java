package com.ceiba.dominio.repositorio;

import com.ceiba.dominio.entidades.Moto;

/**
 * Interface de repositorio Moto
 * @author daniel.castro
 *
 */
public interface RepositorioMoto {
	/**
	 * 
	 * @param Moto
	 */
	void crear(Moto Moto);
	/**
	 * 
	 * @param moto
	 * @return
	 */
	boolean existe(Moto moto);
	/**
	 * 
	 * @param placa
	 */
	void eliminar(String placa);

	//TODO Pendiente referencias comando
}
