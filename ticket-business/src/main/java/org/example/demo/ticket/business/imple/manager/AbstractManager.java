package org.example.demo.ticket.business.imple.manager;

import org.example.demo.ticket.consumer.contract.dao.DaoFactory;
import org.example.demo.ticket.model.bean.projet.Projet;

public class AbstractManager {

	private DaoFactory daoFactory;

	public DaoFactory getDaoFactory() {
		return daoFactory;
	}

	public void setDaoFactory(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	public void insertProjet(Projet projet) {
		// TODO Auto-generated method stub
		
	}
}
