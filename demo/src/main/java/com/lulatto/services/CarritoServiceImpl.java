package com.lulatto.services;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.lulatto.domain.Carrito;
import com.lulatto.domain.Compra;
import com.lulatto.dto.CarritoDTO;
import com.lulatto.repository.CarritoRepository;

@Scope("singleton")
@Service
public class CarritoServiceImpl implements CarritoSevice{
	
	@Autowired
	private CompraService compraService;
	
	@Autowired
	private CarritoRepository carritoRepository;

	@Override
	public CarritoDTO crearCarrito(CarritoDTO carritoDTO) throws SQLException{
		
		Carrito carrito = new Carrito();
		Compra compra = null;
		
		carrito.setCantidad(carritoDTO.getCantidad());
		carrito.setPrecio(carritoDTO.getPrecio());
		
		compra = compraService.findByIdCompra(carritoDTO.getCompra());
		
		if(compra == null) {
			throw new SQLException("No se ha encontrado la compra");
		}
		
		carrito.setCompra(compra);
		
		carritoRepository.save(carrito);
		
		return carritoDTO;
	}

}
