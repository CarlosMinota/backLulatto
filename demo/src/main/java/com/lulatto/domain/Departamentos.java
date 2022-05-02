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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="departamentos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Departamentos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_departamento", unique = true)
	private Long idDepartamento;
	
	@Column(name = "nombre_departamento")
	private String nombreDepartamento;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "departamentos")
	private List<Ciudad> listaCiudades = new ArrayList<>();

}
