package com.lulatto.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
		
		Optional<Cliente> clienteValidar = clienteRepository.findByCedulaOrCorreoElectronico(clienteDTO.getCedula(), clienteDTO.getCorreoElectronico());
		
		if(clienteValidar.isPresent()) {
			throw new SQLException("Ya existe un cliente con la misma cedula o el mismo correo electronico!");
		}
		
		
		if(Utilities.isNull(clienteDTO.getCedula())) {
			throw new SQLException("La cedula no puede estar vacia");
		} else if(clienteDTO.getCedula().length() > 12){
			throw new SQLException("Digite una cedula valida");
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
		
		if(Utilities.isNull(clienteDTO.getPassword())) {
			throw new SQLException("La contraseña no puede estar vacia");
		} else if(clienteDTO.getPassword().length()< 4 && clienteDTO.getPassword().length()> 16) {
			throw new SQLException("La contraseña no puede superar los 16 caracteres o ser menor a 4 caracteres");
		} else {
			cliente.setPassword(clienteDTO.getPassword());
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


	
	@Override
	public Cliente login(String correoElectronico, String password) throws SQLException {
		
		if(Utilities.isNull(correoElectronico)) {
			throw new SQLException("El correo electronico no puede estar vacio");
		}
		
		if(Utilities.isNull(password)) {
			throw new SQLException("La contraseña no puede estar vacia");
		}
		
		Optional<Cliente> clienteValidar = clienteRepository.findByCorreoElectronicoAndPassword(correoElectronico, password);
		
		Cliente cliente = new Cliente();
		
		if(clienteValidar.isPresent()) {
			cliente = clienteValidar.get();
			return cliente;
		} else {
			throw new SQLException("No existe un cliente registrado con ese correo o contraseña");
		}
		
		
	}
	
	
}
