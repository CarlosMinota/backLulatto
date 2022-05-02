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
@Table(name="tipo_producto")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoProducto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_producto", unique = true)
	private Long idTipoProducto;
	
	@Column(name = "genero_producto")
	private String generoProducto;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoProducto")
	private List<Producto> listaProducto = new ArrayList<>();

}
