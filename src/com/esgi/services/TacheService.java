package com.esgi.services;

import java.util.List;

import com.esgi.dao.ITacheDao;
import com.esgi.tache.domaine.Tache;

public class TacheService {

	private ITacheDao dao ;

	public ITacheDao getDao() {
		return dao;
	}

	public void setDao(ITacheDao dao) {
		this.dao = dao;
	}
	
	public void enregistrerTache( Tache uneTache ) {
		dao.enregistrerTache(uneTache);
	}
	
	public Tache getTacheById( int id ) {
		
		return dao.getTacheById(id) ;
		
	}
	
	public List<Tache> getTaches() {
		return dao.getTaches() ;
	}
	
	public void setEtatTache( Tache uneTache ) {
		dao.setEtatTache(uneTache);
	}
	
	public void supprimerTache( Tache uneTache ) {
		dao.supprimerTache(uneTache);
	}
	
	public void supprimerTache( int id ) {
		dao.supprimerTache(id);
	}
	
	public List<Tache> getTachesEnAttente(){
		return dao.getTachesEnAttente() ;
	}
	
}