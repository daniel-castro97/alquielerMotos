package com.ceiba.dominio.servicio;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceiba.dominio.dao.MotoDao;
import com.ceiba.infraestructura.model.Moto;
import antlr.collections.List;

@Service
public class MotoService implements IMotoServie{
	@Autowired
	private MotoDao motoDao;
	
	public Collection<Moto> getMoto(){
		return (Collection<Moto>) motoDao.findAll();
	}
}
