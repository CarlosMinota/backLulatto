package com.lulatto.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long idCliente;
	
	private Long cedula;
	
	private String nombreCliente;
	
	private String telefono;
	
	private String direccion;
	
	private String correoElectronico;
	
	private Long ciudad;

}
