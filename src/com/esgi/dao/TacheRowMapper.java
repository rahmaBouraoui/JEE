package com.esgi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.esgi.tache.domaine.Tache;

public class TacheRowMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int num) throws SQLException {
		
		Tache uneTache = new Tache() ;
		uneTache.setId( rs.getInt( "id" ) );
		uneTache.setLibelle( rs.getString( "libelle" ) );
		uneTache.setEtat( rs.getString( "etat" ) );
		uneTache.setPriorite( rs.getInt( "priorite" ) );
		uneTache.setCreation( rs.getDate( "creation" ) );
		uneTache.setPourLe( rs.getDate( "pourLe" ) );
		
		return uneTache ;
		
	}

}