package com.lulatto.services;

import java.util.List;

import com.lulatto.domain.Ciudad;
import com.lulatto.dto.CiudadDTO;

public interface CiudadService {

	public Ciudad findByIdCiudad(Long idCiudad);
	
	public List<CiudadDTO> findAll();
}
