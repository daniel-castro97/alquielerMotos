package com.ceiba.dominio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ceiba.infraestructura.model.Moto;

@Repository
public interface MotoDao extends JpaRepository<Moto, String>{

}
