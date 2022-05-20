package com.lulatto.dto;

import java.io.Serializable;



import com.lulatto.domain.Departamentos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CiudadDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long idCiudad;
	
	private String nombreCiudad;
	
	private Long departamentos;
	
	
	
}
