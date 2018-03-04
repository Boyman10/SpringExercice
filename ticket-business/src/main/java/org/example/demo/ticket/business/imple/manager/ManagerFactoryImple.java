package org.example.demo.ticket.business.imple.manager;

import org.example.demo.ticket.business.contract.manager.ManagerFactory;
import org.example.demo.ticket.business.contract.manager.ProjetManager;
import org.example.demo.ticket.business.contract.manager.TicketManager;

public class ManagerFactoryImple implements ManagerFactory{
	private ProjetManager projetManager;
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
