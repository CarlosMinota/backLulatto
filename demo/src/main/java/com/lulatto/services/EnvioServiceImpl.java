package com.lulatto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.lulatto.domain.Envio;
import com.lulatto.repository.EnvioRespository;

@Service
@Scope("singleton")
public class EnvioServiceImpl implements EnvioService{

	@Autowired
	private EnvioRespository envioRepository;

	@Override
	public Envio findByIdEnvio(Long idEnvio) {
		
		Envio envio = envioRepository.findByIdEnvio(idEnvio);
		
		return envio;
	}
	
	
}
