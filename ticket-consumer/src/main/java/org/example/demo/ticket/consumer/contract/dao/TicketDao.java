package org.example.demo.ticket.consumer.contract.dao;

import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;

/**
 * Interface contract for TicketDao
 * @author bill
 *
 */
public interface TicketDao {

	public int getCountTicket(RechercheTicket rTicket);
}
