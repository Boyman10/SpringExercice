package org.example.demo.ticket.consumer.contract.dao;

/**
 * Our Dao factory to get and set the proper Dao
 * @author bill
 *
 */
public interface DaoFactory {

	public ProjetDao getProjetDao();
	public ProjetDao getTicketDao();
	
	public void setProjetDao(ProjetDao pd);
	public void setTicketDao(TicketDao td);
}
