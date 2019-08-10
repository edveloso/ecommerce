package br.com.infnet.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.com.infnet.ecommerce.dao.VendaDAO;

@Service
public class VendaService {
	
	
	@Qualifier("Hibernate")
	@Autowired
	private VendaDAO dao;
	
	
	
	public VendaService() {
	}
	
	public double getTotalVenda() {
		return dao.obterValorVenda();
	}

}
