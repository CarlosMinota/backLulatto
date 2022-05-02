package com.lulatto.services;

import java.sql.SQLException;

import com.lulatto.dto.CarritoDTO;

public interface CarritoSevice {
 
	public CarritoDTO crearCarrito(CarritoDTO carritoDTO) throws SQLException;
}
