package com.lulatto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lulatto.dto.ClienteDTO;
import com.lulatto.services.ClienteService;

@RestController
@RequestMapping("lulatto/cliente")
@CrossOrigin("*")
public class ClienteRestController {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/listaClientes")
	public ResponseEntity<?> restonarListaClientes(){
		
		try {
			return ResponseEntity.ok().body(clienteService.traerTodosLosClientes());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
	}
	
	@PostMapping("/addCliente")
	public ResponseEntity<?> addCliente(@RequestBody ClienteDTO clienteDTO){
		try {
			return ResponseEntity.ok().body(clienteService.crearCliente(clienteDTO));
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
	}
	
	@GetMapping("/login")
	public ResponseEntity<?> login(@RequestParam("correoElectronico") String correoElectronico, @RequestParam("password") String password){
		try {
			return ResponseEntity.ok().body(clienteService.login(correoElectronico, password));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
	}
}
