package com.lulatto.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="producto")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_producto", unique = true)
	private Long idProducto;
	
	@Column(name = "nombre_producto")
	private String nombreProducto;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "talla")
	private Integer talla;
	
	@Column(name = "precio")
	private Double precio;
	
	@Column(name = "cantidad_disponible")
	private Integer cantidadDisponible;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tipo_producto_id_tipo_producto")
	private TipoProducto tipoProducto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "carrito_id_carrito")
	private Carrito carrito;
	
	
}
