package com.ceiba.infraestructura.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ceiba.infraestructura.model.MotoEntity;

@Repository
public interface MotoJpa extends JpaRepository<MotoEntity, String>{

	List<MotoEntity> findByPlaca(String placa);
	
	Long deleteByNombre(String placa);
}
