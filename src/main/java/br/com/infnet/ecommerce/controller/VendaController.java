package br.com.infnet.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.infnet.ecommerce.service.VendaService;

@Component
public class VendaController {
	
	@Autowired
	private VendaService service;
	
	
	
	public double getTotalVenda() {
		return service.getTotalVenda();
	}



}
