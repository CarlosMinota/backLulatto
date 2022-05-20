package com.lulatto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.lulatto.domain.Ciudad;
import com.lulatto.dto.CiudadDTO;
import com.lulatto.mappers.CiudadMapper;
import com.lulatto.repository.CiudadRepository;

@Scope("singleton")
@Service
public class CiudadServiceImpl implements CiudadService{

	@Autowired
	private CiudadRepository ciudadRepository;
	
	@Autowired
	private CiudadMapper ciudadMapper;
	
	@Override
	public Ciudad findByIdCiudad(Long idCiudad) {
		// TODO Auto-generated method stub
		Ciudad ciudad = ciudadRepository.findByIdCiudad(idCiudad);
		return ciudad;
	}

	@Override
	public List<CiudadDTO> findAll() {
		List<Ciudad> listaCiudades = ciudadRepository.findAll();
		return ciudadMapper.listCiudadToListCiudadDTO(listaCiudades);
	}
	

}
