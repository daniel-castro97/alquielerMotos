package com.ceiba.dominio.servicio;

import org.springframework.stereotype.Component;

import com.ceiba.dominio.entidades.Moto;
import com.ceiba.dominio.excepcion.ExcepcionValidadorMoto;
import com.ceiba.dominio.repositorio.RepositorioMoto;

@Component
public class ServicioCrearMoto {

	private RepositorioMoto repositorioMoto;
	
	public void servicioCrear(RepositorioMoto moto) {
		this.repositorioMoto = moto;
	}
	
	public void crear(Moto moto) {
		validarExistencia(moto);
		this.repositorioMoto.crear(moto);
	}
	
	private void validarExistencia(Moto moto) {
		boolean existe = this.repositorioMoto.existe(moto);
		if(existe) {
			throw new ExcepcionValidadorMoto("");
		}
	}
	
	
	public void eliminar(String placa) {
		this.repositorioMoto.eliminar(placa);
	}
}
