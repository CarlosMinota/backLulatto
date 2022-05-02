package com.lulatto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lulatto.domain.Ciudad;

public interface CiudadRepository extends JpaRepository<Ciudad, Long>{

	public Ciudad findByIdCiudad(Long idCiudad);
}
