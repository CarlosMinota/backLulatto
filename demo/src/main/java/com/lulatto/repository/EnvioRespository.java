package com.lulatto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lulatto.domain.Envio;

public interface EnvioRespository extends JpaRepository<Envio, Long>{

	public Envio findByIdEnvio(Long idEnvio);
}
