package com.esgi.dao;

import java.util.List;

import com.esgi.tache.domaine.Tache;

public interface ITacheDao {
	
	public void enregistrerTache( Tache uneTache ) ;
	public Tache getTacheById( int id ) ;
	public List<Tache> getTaches() ;
	public void setEtatTache( Tache uneTache ) ;
	public void supprimerTache( Tache uneTache ) ;
	public void supprimerTache( int id ) ;
	
	public List<Tache> getTachesEnAttente() ;

}
