package com.lulatto.services;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.lulatto.domain.Cliente;
import com.lulatto.domain.Compra;
import com.lulatto.domain.Envio;
import com.lulatto.dto.CompraDTO;
import com.lulatto.repository.CompraRepository;

@Service
@Scope("singleton")
public class CompraServiceImpl implements CompraService{
	
	@Autowired
	private CompraRepository compraRepository;
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private EnvioService envioService;
	

	@Override
	public CompraDTO addCompra(CompraDTO compraDTO) throws SQLException {
		
		Compra compra = new Compra();
		
		Cliente cliente = null;
		Envio envio = null;
		
		compra.setPrecio(compraDTO.getPrecio());

		cliente = clienteService.findByIdCliente(compraDTO.getCliente());
		
		if (cliente == null) {
			throw new SQLException("El cliente no se ha podido encontrar");
		}
		
		compra.setCliente(cliente);
		
		envio = envioService.findByIdEnvio(compraDTO.getEnvio());
		
		if(envio == null) {
			throw new SQLException("El estado de envio no exite");
		}
		
		compra.setEnvio(envio);
		
		compraRepository.save(compra);
		
		return compraDTO;
	}


	@Override
	public Compra findByIdCompra(Long idCompra) throws SQLException {
		Compra compra = compraRepository.findByIdCompra(idCompra);
		return compra;
	}

}
