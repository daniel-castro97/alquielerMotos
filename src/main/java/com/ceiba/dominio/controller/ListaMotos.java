package com.ceiba.dominio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.dominio.servicio.IMotoServie;
import com.ceiba.infraestructura.model.Moto;


@RestController
@RequestMapping("/lista")
public class ListaMotos {
	@Autowired
	private IMotoServie motoServie;
	
	@GetMapping("/motos")
	public List<Moto> getMotos(){
		return motoServie.getMoto();
	}

}
