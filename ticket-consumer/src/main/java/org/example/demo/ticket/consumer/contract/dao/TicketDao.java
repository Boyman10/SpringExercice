package org.example.demo.ticket.consumer.contract.dao;

import java.util.List;

import org.example.demo.ticket.model.bean.ticket.TicketStatut;
import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;

/**
 * Interface contract for TicketDao
 * @author bill
 *
 */
public interface TicketDao {

	public int getCountTicket(RechercheTicket rTicket);
	public List<TicketStatut> getListStatut();
	public void updateTicketStatut(TicketStatut pTicketStatut);
}
