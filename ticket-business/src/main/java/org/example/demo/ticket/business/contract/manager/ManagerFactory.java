package org.example.demo.ticket.business.contract.manager;

public interface ManagerFactory {

	TicketManager getTicketManager();

	ProjetManager getProjetManager();
	
	UtilisateurManager getUtilisateurManager();
	
	TicketStatutManager getTicketStatutManager();

	void setTicketManager(TicketManager ticketManager);

	void setProjetManager(ProjetManager projetManager);
	void setUtilisateurManager(UtilisateurManager utilisateurManager);
	void setTicketStatutManager(TicketStatutManager ticketStatutManager);
}
