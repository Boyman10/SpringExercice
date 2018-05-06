package org.example.demo.ticket.business.imple.manager;

import java.util.List;

import org.example.demo.ticket.business.contract.manager.UtilisateurManager;
import org.example.demo.ticket.model.bean.utilisateur.Utilisateur;
import org.example.demo.ticket.model.exception.NotFoundException;

public class UtilisateurManagerImpl extends AbstractManager implements UtilisateurManager {

	@Override
	public List<Utilisateur> getListUtilisateur() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur getUtilisateur(String pseudo, String pass) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
