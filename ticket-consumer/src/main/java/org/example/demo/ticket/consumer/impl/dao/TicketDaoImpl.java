package org.example.demo.ticket.consumer.impl.dao;

import java.sql.Types;
import java.util.List;

import javax.inject.Named;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.example.demo.ticket.consumer.contract.dao.TicketDao;
import org.example.demo.ticket.consumer.impl.rm.TicketStatutRM;
import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.bean.ticket.TicketStatut;
import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;


@Named("ticketDao")
public class TicketDaoImpl extends AbstractDaoImpl implements TicketDao{

	private static final Log LOGGER = LogFactory.getLog(TicketDaoImpl.class);

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

	
		return nParamTemplate.queryForObject(vSQL.toString(), vParams, Integer.class);
	}

	@Override
	public List<TicketStatut> getListStatut() {

        String vSQL = "SELECT * FROM public.statut";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        RowMapper<TicketStatut> vRowMapper = new TicketStatutRM();

        List<TicketStatut> vListStatut = vJdbcTemplate.query(vSQL, vRowMapper);

        return vListStatut;
	}
	
	@Override
	public void updateTicketStatut(TicketStatut pTicketStatut) {
		
		// Must have matching parameters with bean property elements .
	    String vSQL = "UPDATE statut SET libelle = :libelle WHERE id = :id";
	    NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

	    BeanPropertySqlParameterSource vParams = new BeanPropertySqlParameterSource(pTicketStatut);
        vParams.registerSqlType("id", Types.INTEGER);
        vParams.registerSqlType("libelle", Types.VARCHAR);
        
	    int vNbrLigneMaJ;
	    
	    try {
	    	vNbrLigneMaJ =  vJdbcTemplate.update(vSQL, vParams);
	    } catch (DuplicateKeyException vEx) {
	        LOGGER.error("Le TicketStatut existe déjà ! id=" + pTicketStatut.getId(), vEx);
	        
	    }
	}
	
	public void insertTicketStatut(TicketStatut pTicketStatut) {
	    String vSQL = "INSERT INTO statut (id, libelle) VALUES (:id, :libelle)";
	    NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

	    BeanPropertySqlParameterSource vParams = new BeanPropertySqlParameterSource(pTicketStatut);
	    vParams.registerSqlType("id", Types.INTEGER);
	    vParams.registerSqlType("libelle", Types.VARCHAR);

	    try {
	        vJdbcTemplate.update(vSQL, vParams);
	    } catch (DuplicateKeyException vEx) {
	        LOGGER.error("Le TicketStatut existe déjà ! id=" + pTicketStatut.getId(), vEx);
	        // ...
	    }
	}

	@Override
	public void updateTicket(Ticket pTicket) {
		// TODO Auto-generated method stub
		
	}

}
