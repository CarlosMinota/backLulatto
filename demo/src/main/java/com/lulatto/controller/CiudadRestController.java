package com.lulatto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lulatto.services.CiudadService;

@RestController
@RequestMapping("lulatto/ciudad")
@CrossOrigin("*")
public class CiudadRestController {
	
	@Autowired
	private CiudadService ciudadService;

	@GetMapping("/listaCiudades")
	public ResponseEntity<?> retornarCiudades(){
		try {
			return ResponseEntity.ok().body(ciudadService.findAll());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
	}
}
