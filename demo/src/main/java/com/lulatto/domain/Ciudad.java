package com.lulatto.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="ciudad")
public class Ciudad implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_ciudad", unique = true)
	private Long idCiudad;
	
	@Column(name = "nombre_ciudad")
	private String nombreCiudad;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "departamentos_id_departamento")
	private Departamentos departamentos;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ciudad")
	private List<Cliente> cliente = new ArrayList<>();

	
	
	public Ciudad(Long idCiudad, String nombreCiudad, Departamentos departamentos, List<Cliente> cliente) {
		super();
		this.idCiudad = idCiudad;
		this.nombreCiudad = nombreCiudad;
		this.departamentos = departamentos;
		this.cliente = cliente;
	}

	public Ciudad() {
		super();
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

	public List<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}

	
	
}
