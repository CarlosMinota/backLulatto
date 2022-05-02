package com.lulatto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.lulatto.domain.Ciudad;
import com.lulatto.repository.CiudadRepository;

@Scope("singleton")
@Service
public class CiudadServiceImpl implements CiudadService{

	@Autowired
	private CiudadRepository ciudadRepository;
	
	@Override
	public Ciudad findByIdCiudad(Long idCiudad) {
		// TODO Auto-generated method stub
		Ciudad ciudad = ciudadRepository.findByIdCiudad(idCiudad);
		return ciudad;
	}

}
