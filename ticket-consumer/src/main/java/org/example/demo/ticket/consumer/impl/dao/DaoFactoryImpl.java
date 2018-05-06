package org.example.demo.ticket.consumer.impl.dao;

import javax.inject.Named;

import org.example.demo.ticket.consumer.contract.dao.DaoFactory;
import org.example.demo.ticket.consumer.contract.dao.ProjetDao;
import org.example.demo.ticket.consumer.contract.dao.TicketDao;
import org.springframework.beans.factory.annotation.Autowired;

@Named("daoFactory")
public class DaoFactoryImpl implements DaoFactory {

	@Autowired
	private ProjetDao pDao;
	@Autowired
	private TicketDao tDao;
	
	@Override
	public ProjetDao getProjetDao() {
		return pDao;
	}

	@Override
	public TicketDao getTicketDao() {
		
		return tDao;
	}

	@Override
	public void setProjetDao(ProjetDao pd) {

		pDao = pd;
	}

	@Override
	public void setTicketDao(TicketDao td) {

		tDao = td;
	}

}
