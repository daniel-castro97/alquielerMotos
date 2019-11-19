package com.ceiba.infraestructura.adaptador.repositorio;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ceiba.dominio.entidades.Moto;
import com.ceiba.dominio.repositorio.RepositorioMoto;
import com.ceiba.infraestructura.jpa.MotoJpa;
import com.ceiba.infraestructura.model.MotoEntity;

@Repository
public class RepositorioMotoJpa implements RepositorioMoto{
	@Autowired
	private final MotoJpa motoJpa; 
	
	private ModelMapper modelMapper = new ModelMapper();
	
	public  RepositorioMotoJpa(MotoJpa jpa) {
		this.motoJpa = jpa;
	}
	@Override
	public void crear(Moto moto) {
		MotoEntity motoEntity = modelMapper.map(moto, MotoEntity.class);
		motoJpa.save(motoEntity);
	}

	@Override
	public boolean existe(Moto moto) {
		List<MotoEntity> aux;
		MotoEntity motoEntity = modelMapper.map(moto, MotoEntity.class);
		aux = motoJpa.findByPlaca(motoEntity.getPlaca());
		return !aux.isEmpty();
	}

	@Override
	public void eliminar(String placa) {
		motoJpa.deleteById(placa);
		
	}

}
