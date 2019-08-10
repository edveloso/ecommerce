package br.com.infnet.ecommerce.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier(value = "JPA")
public class VendaJPADAO implements VendaDAO {

	public double obterValorVenda() {
		return 300.0;
	}
	
}
