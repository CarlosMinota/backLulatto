package com.lulatto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lulatto.domain.Carrito;


@Repository
public interface CarritoRepository extends JpaRepository<Carrito, Long>{

	
}
