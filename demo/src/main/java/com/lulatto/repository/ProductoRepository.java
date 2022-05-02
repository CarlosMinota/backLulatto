package com.lulatto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lulatto.domain.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
