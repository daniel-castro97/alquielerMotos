package com.ceiba.dominio.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.infraestructura.model.Moto;
import com.ceiba.dominio.servicio.IMotoServie;

import antlr.collections.List;

@RestController
@RequestMapping(value="lista")
public class ListaMotos {
	@Autowired
	private IMotoServie motoServie;
	
	@GetMapping(value="motos")
	public Collection<Moto> getMotos(){
		return motoServie.getMoto();
	}

}
