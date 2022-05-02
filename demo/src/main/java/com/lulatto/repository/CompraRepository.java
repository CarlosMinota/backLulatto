package com.lulatto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lulatto.domain.Compra;

public interface CompraRepository extends JpaRepository<Compra, Long>{

	public Compra findByIdCompra(Long idCompra);
}
