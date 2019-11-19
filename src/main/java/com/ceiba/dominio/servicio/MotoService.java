package com.ceiba.dominio.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceiba.dominio.dao.MotoDao;
import com.ceiba.infraestructura.model.Moto;


@Service
public class MotoService implements IMotoServie{
	@Autowired
	private MotoDao motoDao;

	@Override
	public List<Moto> findAll() {

		return motoDao.findAll();
	}
	

}
