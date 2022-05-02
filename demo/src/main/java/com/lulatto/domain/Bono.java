package com.lulatto.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="bono")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bono implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_bono", unique = true)
	private Long idBono;
	
	@Column(name="precio_bono")
	private Integer precioBono;
	
	@Column(name="estado")
	private String estado;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="carrito_id_carrito")
	private Carrito carrito;
	
}
