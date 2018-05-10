package org.example.demo.ticket.business.imple.manager;

import java.util.List;

import org.example.demo.ticket.business.contract.manager.TicketStatutManager;

import org.example.demo.ticket.model.bean.ticket.TicketStatut;
import org.example.demo.ticket.model.exception.NotFoundException;

public class TicketStatutManagerImpl extends AbstractManager implements TicketStatutManager{

	@Override
	public int getCountStatut() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public List<TicketStatut> getListStatuts() {
		
		return getDaoFactory().getTicketDao().getListStatut();

	}

	@Override
	public TicketStatut getTicketStatut(Long pNumero) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}


}
