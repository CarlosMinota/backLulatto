package com.lulatto.dto;

import java.io.Serializable;

import com.lulatto.domain.Carrito;
import com.lulatto.domain.TipoProducto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long idProducto;
	
	private String nombreProducto;
	
	private String color;
	
	private Integer talla;
	
	private Double precio;
	
	private Integer cantidadDisponible;
	
	private TipoProducto tipoProducto;
	
	private Carrito carrito;

}
