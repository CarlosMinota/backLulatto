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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_cliente", nullable = false, unique = true)
	private Long idCliente;
	
	@Column(name = "cedula")
	private String cedula;
	
	@Column(name = "nombre_cliente")
	private String nombreCliente;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "correo_electronico")
	private String correoElectronico;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ciudad_id_ciudad")
	private Ciudad ciudad;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	private List<Compra> listaCompra = new ArrayList<>();
	
	
}
