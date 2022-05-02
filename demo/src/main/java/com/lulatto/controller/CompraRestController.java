package com.lulatto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lulatto.dto.CompraDTO;
import com.lulatto.services.CompraService;

@RestController
@RequestMapping("lulatto/compra")
public class CompraRestController {
	
	@Autowired
	private CompraService compraService;
	
	@PostMapping("/addCompra")
	public ResponseEntity<?> addCompra(@RequestBody CompraDTO compraDTO){
		try {
			return ResponseEntity.ok().body(compraService.addCompra(compraDTO));
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
	}
}
