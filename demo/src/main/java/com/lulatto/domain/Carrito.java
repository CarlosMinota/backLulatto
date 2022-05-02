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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="carrito")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carrito implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_carrito", unique = true)
	private Long idCarrito;
	
	@Column(name="cantidad")
	private Integer cantidad;
	
	@Column(name="precio")
	private Double precio;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="compra_id_compra")
	private Compra compra;
	
	@OneToOne(mappedBy = "carrito")
	private Bono bono;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "carrito")
	private List<Producto> listaProductos = new ArrayList<>();

}
