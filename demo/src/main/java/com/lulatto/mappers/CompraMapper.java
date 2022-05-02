package com.lulatto.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.lulatto.domain.Compra;
import com.lulatto.dto.CompraDTO;

@Mapper(componentModel = "spring")
public interface CompraMapper {

	@Mapping(source = "cliente", target = "cliente.idCliente")
	@Mapping(source = "envio", target = "envio.idEnvio")
	public Compra compraDTOToCompra (CompraDTO compraDTO);
	
	@Mapping(source = "cliente.idCliente", target = "cliente")
	@Mapping(source = "envio.idEnvio", target = "envio")
	public CompraDTO compraToCompraDTO (Compra compra);
	
	public List<Compra> lstCompraDTOToLstCompra (List<CompraDTO> lstCompraDTO);
	
	public List<CompraDTO> lstCompraToCompraDTO (List<Compra> lstCompra);
}
