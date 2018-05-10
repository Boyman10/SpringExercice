package org.example.demo.ticket.business.contract.manager;

import java.util.List;

import org.example.demo.ticket.model.bean.ticket.TicketStatut;
import org.example.demo.ticket.model.exception.NotFoundException;

public interface TicketStatutManager {

		int getCountStatut();

		List<TicketStatut> getListStatuts();

		TicketStatut getTicketStatut(Long pNumero) throws NotFoundException;

	}
