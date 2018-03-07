package org.example.demo.ticket.business.imple.manager;

import javax.inject.Inject;
import javax.inject.Named;

import org.example.demo.ticket.business.contract.manager.ManagerFactory;
import org.example.demo.ticket.business.contract.manager.ProjetManager;
import org.example.demo.ticket.business.contract.manager.TicketManager;

@Named("managerFactory")
public class ManagerFactoryImple implements ManagerFactory{
	
	@Inject
	private ProjetManager projetManager;
	@Inject
	private TicketManager ticketManager;
	
	@Override
	public void setProjetManager(ProjetManager projetManager) {
		this.projetManager = projetManager;
	}
	
	@Override
	public void setTicketManager(TicketManager ticketManager) {
		this.ticketManager = ticketManager;
	}
	
	@Override
	public ProjetManager getProjetManager() {
		
		return projetManager;
		
	}
	@Override
	public TicketManager getTicketManager() {
		
		return ticketManager;
		
	}	
}
