package com.lulatto;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lulatto.domain.Envio;
import com.lulatto.services.EnvioService;

@SpringBootTest
public class EnvioTest {

	@Autowired
	private EnvioService envioService;
	
	@Test
	public void prueba() {
		Envio envio = envioService.findByIdEnvio(1L);
		System.out.println("El envio es "+ envio.getEstado());
	}
}
