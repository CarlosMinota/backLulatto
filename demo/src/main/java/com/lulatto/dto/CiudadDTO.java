package com.lulatto.dto;

import java.io.Serializable;



import com.lulatto.domain.Departamentos;



public class CiudadDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long idCiudad;
	
	private String nombreCiudad;
	
	private Departamentos departamentos;
	
	public CiudadDTO() {
		super();
	}

	public CiudadDTO(Long idCiudad, String nombreCiudad, Departamentos departamentos) {
		super();
		this.idCiudad = idCiudad;
		this.nombreCiudad = nombreCiudad;
		this.departamentos = departamentos;
	}

	public Long getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(Long idCiudad) {
		this.idCiudad = idCiudad;
	}

	public String getNombreCiudad() {
		return nombreCiudad;
	}

	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}

	public Departamentos getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(Departamentos departamentos) {
		this.departamentos = departamentos;
	}

	
}
