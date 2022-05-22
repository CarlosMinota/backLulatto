package com.lulatto.services;

import java.sql.SQLException;
import java.util.List;

import com.lulatto.domain.Cliente;
import com.lulatto.dto.ClienteDTO;

public interface ClienteService {

	public List<Cliente> traerTodosLosClientes() throws Exception;
	
	public ClienteDTO crearCliente(ClienteDTO clienteDTO) throws SQLException;
	
	public Cliente findByIdCliente(Long idCliente) throws SQLException;
	
	public Cliente login(String correoElectronico, String password) throws SQLException;
}
