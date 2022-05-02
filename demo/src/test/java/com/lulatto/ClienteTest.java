package com.lulatto;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lulatto.domain.Cliente;
import com.lulatto.services.ClienteService;

@SpringBootTest
public class ClienteTest {

	@Autowired
	private ClienteService clienteService;
	
	@Test
	public void prueba() {
		try {
			Cliente cliente = clienteService.findByIdCliente(1L);
			System.out.println("El nombre del cliente es: "+cliente.getNombreCliente());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
