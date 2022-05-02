package com.lulatto.services;

import java.sql.SQLException;

import com.lulatto.domain.Compra;
import com.lulatto.dto.CompraDTO;

public interface CompraService {

	public CompraDTO addCompra(CompraDTO compraDTO) throws SQLException;
	
	public Compra findByIdCompra(Long idCompra) throws SQLException;
}
