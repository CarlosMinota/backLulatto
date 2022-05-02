package com.lulatto.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.lulatto.domain.Carrito;
import com.lulatto.dto.CarritoDTO;

@Mapper(componentModel = "spring")
public interface CarritoMapper {

	@Mapping(source = "compra", target = "compra.idCompra")
	public Carrito carritoDTOToCarrito(CarritoDTO carritoDTO); 
	
	@Mapping(source = "compra.idCompra", target = "compra")
	public CarritoDTO carritoToCarritoDTO(Carrito carrito);
	
	public List<Carrito> lstCarritoDTOToCarrito(List<CarritoDTO> lstCarritoDTO);
	
	public List<CarritoDTO> lstCarritoToCarritoDTO(List<Carrito> lstCarrito);
}
