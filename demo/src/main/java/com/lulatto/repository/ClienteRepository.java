package com.lulatto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lulatto.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	public Cliente findByIdCliente(Long idCliente);
}
