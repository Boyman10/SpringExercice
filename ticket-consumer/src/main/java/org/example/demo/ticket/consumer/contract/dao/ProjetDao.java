package org.example.demo.ticket.consumer.contract.dao;

import org.example.demo.ticket.model.bean.utilisateur.Utilisateur;

/**
 * Interface to define contract for managing projects
 * @author bill
 *
 */
public interface ProjetDao {
	public int getCountProjet(Utilisateur responsable);

}
