package com.esgi.dao;

import java.util.List;

import com.esgi.tache.domaine.Tache;

public interface ITacheDao {
	
	public Tache getTacheById(int id) ;
	public void saveTache(Tache tache);
	public int getTachesCount();
	public List<Tache> getAllTaches();

}
