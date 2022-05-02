package com.lulatto;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lulatto.domain.Ciudad;
import com.lulatto.services.CiudadService;

@SpringBootTest
public class CiudadTest {

	@Autowired
	private CiudadService ciudadService;
	
	@Test
	public void prueba() {
		
		Ciudad ciudad = ciudadService.findByIdCiudad(1L);
		System.out.println("La ciudad con ID "+ ciudad.getIdCiudad()+" es: "+ciudad.getNombreCiudad());
	}
}
