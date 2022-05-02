package com.lulatto.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="envio")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Envio implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_envio",unique = true)
	private Long idEnvio;
	
	@Column(name = "estado_envio")
	private String estado;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "envio")
	private Compra compra;
}
