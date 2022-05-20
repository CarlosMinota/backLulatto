package com.lulatto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lulatto.domain.Ciudad;

public interface CiudadRepository extends JpaRepository<Ciudad, Long>{

	public Ciudad findByIdCiudad(Long idCiudad);
	
	public List<Ciudad> findAll();
	
}
