package br.com.infnet.ecommerce.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier(value ="Hibernate")
public class VendaHibernateDAO implements VendaDAO {

	public double obterValorVenda() {
		return 500.0;
	}

}
