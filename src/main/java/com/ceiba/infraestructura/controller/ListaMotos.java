package com.ceiba.infraestructura.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.infraestructura.model.MotoEntity;
import com.ceiba.infraestructura.servicio.IMotoServie;


@RestController
@RequestMapping(value ="/lista")
@Component
public class ListaMotos {
	@Autowired
	private IMotoServie motoServie;
	
	public ListaMotos(IMotoServie motoServie) {
		this.motoServie=motoServie;
	}
	
	@GetMapping(path ="/motos")
	public List<MotoEntity> getMotos(){
		return motoServie.findAll();
	}
	
	@PostMapping(path = "/crear")
	public String crear() {
		return "OK";
	}
}
