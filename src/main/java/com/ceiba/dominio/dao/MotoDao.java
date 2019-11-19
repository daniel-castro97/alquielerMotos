package com.ceiba.dominio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ceiba.infraestructura.model.Moto;

public interface MotoDao extends JpaRepository<Moto, String>{

}
