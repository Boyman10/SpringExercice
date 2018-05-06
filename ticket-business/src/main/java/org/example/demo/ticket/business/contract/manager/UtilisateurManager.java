package org.example.demo.ticket.business.contract.manager;

import java.util.List;

import org.example.demo.ticket.model.bean.utilisateur.Utilisateur;
import org.example.demo.ticket.model.exception.NotFoundException;

public interface UtilisateurManager {
	List<Utilisateur> getListUtilisateur();

	Utilisateur getUtilisateur(Integer pId) throws NotFoundException;

}
