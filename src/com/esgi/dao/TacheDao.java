package com.esgi.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


import com.esgi.tache.domaine.Tache;

public class TacheDao implements ITacheDao {

	private JdbcTemplate jdbcTemplate ;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public void enregistrerTache(Tache uneTache ) {
		final String REQ =
				"insert into Tache(libelle,priorite,etat,creation,pourLe) " +
				"values ( ? , ? , ? , ? , ? )";
		
		jdbcTemplate.update( REQ, new Object[] {
			uneTache.getLibelle() ,
			uneTache.getPriorite() ,
			uneTache.getEtat() ,
			uneTache.getCreation() ,
			uneTache.getPourLe()
		}) ;
		
		
	}

	@Override
	public Tache getTacheById(int id) {
		final String REQ = "select * from Tache where id = ?" ;
		
		Tache uneTache = (Tache) jdbcTemplate.queryForObject( REQ , new Object[] { id } , new TacheRowMapper() ) ;
		
		return uneTache ;
	}

	@Override
	public List<Tache> getTaches() {
		final String REQ = "select * from Tache" ;
		
		List<Tache> taches = jdbcTemplate.query( REQ , new TacheRowMapper() ) ;
		
		return taches ;
	}


	@Override
	public void setEtatTache(Tache uneTache) {
		
		final String REQ = "update Tache set etat = ? where id = ?" ;
		
		jdbcTemplate.update( REQ, new Object[] { uneTache.getEtat() , uneTache.getId() } ) ;
	}

	@Override
	public void supprimerTache(Tache uneTache) {
		final String REQ = "delete from Tache where id = ?" ;
		
		jdbcTemplate.update( REQ, new Object[] { uneTache.getId() } ) ;
		
	}

	@Override
	public void supprimerTache(int id) {
		final String REQ = "delete from Tache where id = ?" ;
		
		jdbcTemplate.update( REQ, new Object[] { id } ) ;
	}

	@Override
	public List<Tache> getTachesEnAttente() {
		
		final String REQ = "select * from Tache where etat = 'EA' order by priorite desc" ;
		
		List<Tache> taches = jdbcTemplate.query( REQ , new TacheRowMapper() ) ;
		
		return taches ;
	}


}
