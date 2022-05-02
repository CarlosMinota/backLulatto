package com.lulatto.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.lulatto.domain.Ciudad;
import com.lulatto.domain.Cliente;
import com.lulatto.dto.ClienteDTO;
import com.lulatto.repository.ClienteRepository;
import com.lulatto.utils.Utilities;

@Scope("singleton")
@Service
public class ClienteServiceImpl  implements ClienteService{

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private CiudadService ciudadService;
	
	public List<Cliente> traerTodosLosClientes() throws Exception{
		
		List<Cliente> listaCliente = new ArrayList<>();
		
		listaCliente = clienteRepository.findAll();
		
		return listaCliente;
		
	}

	@Override
	public ClienteDTO crearCliente(ClienteDTO clienteDTO) throws SQLException {
		
		Cliente cliente = new Cliente();
		Ciudad ciudad = null;
		
		if(Utilities.isNull(clienteDTO.getCedula())) {
			throw new SQLException("La cedula no puede estar vacia");
		} else {
			cliente.setCedula(clienteDTO.getCedula());
		}
		
		if(Utilities.isNull(clienteDTO.getNombreCliente())) {
			throw new SQLException("El nombre no puede estar vacio");
		} else if(Utilities.isNumeric(clienteDTO.getNombreCliente())) {
			throw new SQLException("El nombre no puede contener numeros");
		} else if(clienteDTO.getNombreCliente().length() > 100) {
			throw new SQLException("El nombre no es valido");
		} else {
			cliente.setNombreCliente(clienteDTO.getNombreCliente());
		}
		
		if(Utilities.isNull(clienteDTO.getTelefono())) {
			throw new SQLException("El telefono no puede estar vacio");
		}  else if(clienteDTO.getTelefono().length() > 13) {
			throw new SQLException("El telefono no es valido");
		} else {
			cliente.setTelefono(clienteDTO.getTelefono());
		}
		
		if(Utilities.isNull(clienteDTO.getDireccion())) {
			throw new SQLException("La direccion no puede estar vacio");
		} else {
			cliente.setDireccion(clienteDTO.getDireccion());
		}
		
		if(Utilities.isNull(clienteDTO.getCorreoElectronico())) {
			throw new SQLException("El correo electronico no puede estar vacio");
		} else {
			cliente.setCorreoElectronico(clienteDTO.getCorreoElectronico());
		}		
		
		ciudad = ciudadService.findByIdCiudad(clienteDTO.getCiudad());
		
		if(ciudad == null) {
			throw new SQLException("La ciudad con el codigo "+clienteDTO.getCiudad()+" no existe");
		} else {
			cliente.setCiudad(ciudad);
		}
		
		clienteRepository.save(cliente);
		
		return clienteDTO;
	}

	@Override
	public Cliente findByIdCliente(Long idCliente) throws SQLException {
		Cliente cliente = clienteRepository.findByIdCliente(idCliente);
		return cliente;
	}
	
	
}
