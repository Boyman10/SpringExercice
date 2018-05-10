package org.example.demo.ticket.consumer.impl.dao;

import javax.inject.Named;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.example.demo.ticket.consumer.contract.dao.ProjetDao;
import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.bean.utilisateur.Utilisateur;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Named("projetDao")
public class ProjetDaoImpl extends AbstractDaoImpl implements ProjetDao {

	private static final Log LOGGER = LogFactory.getLog(TicketDaoImpl.class);

	@Override
	public int getCountProjet(Utilisateur responsable) {
		
        StringBuilder vSQL = new StringBuilder("SELECT COUNT(*) FROM projet WHERE 1=1");
		
		NamedParameterJdbcTemplate nParamTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource();
        
        
        if (responsable != null) {
            if (responsable.getId() != null) {
                vSQL.append(" AND responsable_id = :responsable_id");
                vParams.addValue("responsable_id", responsable.getId());
            }
        }

	
		return nParamTemplate.queryForObject(vSQL.toString(), vParams, Integer.class);
	}

	@Override
	public void updateTicket(Ticket pTicket) {
		
		
	}
}
