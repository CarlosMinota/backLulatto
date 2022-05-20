package com.lulatto.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.lulatto.domain.Ciudad;
import com.lulatto.dto.CiudadDTO;

@Mapper(componentModel = "spring")
public interface CiudadMapper {

	@Mapping(source = "departamentos", target = "departamentos.idDepartamento" )
	public Ciudad ciudadDTOToCiudad(CiudadDTO ciudadDTO);
	
	@Mapping(source = "departamentos.idDepartamento", target = "departamentos")
	public CiudadDTO ciudadToCiudadDTO(Ciudad ciudad);
	
	public List<Ciudad> listCiudadDTOToListCiudad(List<CiudadDTO> listCiudadDTO);
	
	public List<CiudadDTO> listCiudadToListCiudadDTO(List<Ciudad> listCiudad);
}
