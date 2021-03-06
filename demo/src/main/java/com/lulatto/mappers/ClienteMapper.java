package com.lulatto.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.lulatto.domain.Cliente;
import com.lulatto.dto.ClienteDTO;



@Mapper(componentModel = "spring")
public interface ClienteMapper {

	@Mapping(source = "ciudad", target = "ciudad.idCiudad")
	public Cliente ClienteDTOToCliente(ClienteDTO clienteDTO);
	
	@Mapping(source = "ciudad.idCiudad", target = "ciudad")
	public ClienteDTO ClienteToClienteDTO(Cliente cliente);
	
	public List<Cliente> lstClienteDTOToLstCliente(List<ClienteDTO> lstClienteDTO);
	
	public List<ClienteDTO> lstClienteToLstClienteDTO(List<Cliente> lstCliente);
}
