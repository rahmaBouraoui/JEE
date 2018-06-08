package com.esgi.tache.domaine;

public class Tache {

	private int id ;
	private String libelle ;
	private int priorite ;
	private String etat ;
	
	public Tache() {
		super();
	}
	public Tache(int id, String libelle, int priorite, String etat) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.priorite = priorite;
		this.etat = etat;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public int getPriorite() {
		return priorite;
	}
	public void setPriorite(int priorite) {
		this.priorite = priorite;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	
	
}
