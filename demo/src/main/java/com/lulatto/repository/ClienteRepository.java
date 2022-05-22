package com.lulatto.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lulatto.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	public Cliente findByIdCliente(Long idCliente);
	
	
	/**
	 * 
	 * @param correoElectronico
	 * @param password
	 * @return cliente con correo y password
	 */
	Optional<Cliente> findByCorreoElectronicoAndPassword(String correoElectronico, String password);
	
	/**
	 * 
	 * @param cedula
	 * @param correoElectronico
	 * @return retorna el cliente con la cedula y el correo electronico
	 */
	Optional<Cliente> findByCedulaOrCorreoElectronico(String cedula, String correoElectronico);
	
}
