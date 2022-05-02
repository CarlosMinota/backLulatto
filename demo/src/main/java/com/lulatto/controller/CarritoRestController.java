package com.lulatto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lulatto.dto.CarritoDTO;
import com.lulatto.services.CarritoSevice;


@RestController
@RequestMapping("lulatto/carrito")
public class CarritoRestController {
	
	@Autowired
	private CarritoSevice carritoService;
	
	@PostMapping("/addCarrito")
	public ResponseEntity<?> addCarrito(@RequestBody CarritoDTO carritoDTO){
		try {
			return ResponseEntity.ok().body(carritoService.crearCarrito(carritoDTO));
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
	}
	
	
}
