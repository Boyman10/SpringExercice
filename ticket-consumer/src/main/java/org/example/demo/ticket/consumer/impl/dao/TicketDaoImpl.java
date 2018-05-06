package org.example.demo.ticket.consumer.impl.dao;

import javax.inject.Named;

import org.example.demo.ticket.consumer.contract.dao.TicketDao;
import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Named
public class TicketDaoImpl extends AbstractDaoImpl implements TicketDao{

	@Override
	public int getCountTicket(RechercheTicket rTicket) {
		
        StringBuilder vSQL = new StringBuilder("SELECT COUNT(*) FROM ticket WHERE 1=1");
		
		NamedParameterJdbcTemplate nParamTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource();
        
        
        if (rTicket != null) {
            if (rTicket.getAuteurId() != null) {
                vSQL.append(" AND auteur_id = :auteur_id");
                vParams.addValue("auteur_id", rTicket.getAuteurId());
            }
            if (rTicket.getProjetId() != null) {
                vSQL.append(" AND projet_id = :projet_id");
                vParams.addValue("projet_id", rTicket.getProjetId());
            }
        }

	
		return nParamTemplate.queryForObject(vSQL, vParams, Integer.class);
	}

}
