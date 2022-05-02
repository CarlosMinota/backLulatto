package com.lulatto.dto;

import java.io.Serializable;

import com.lulatto.domain.Carrito;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BonoDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long idBono;
	
	private Integer precioBono;
	
	private String estado;
	
	private Carrito carrito;

}
