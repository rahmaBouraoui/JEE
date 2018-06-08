package com.esgi.tache.domaine;

import java.util.Date;

public class Tache {
	
	private int id ;
	private String libelle ;
	private int priorite = 1 ;
	private String etat = "EA" ;
	private Date creation ;
	private Date pourLe ;
	
	public Tache(int id, String libelle, int priorite, String etat, Date creation, Date pourLe) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.priorite = priorite;
		this.etat = etat;
		this.creation = creation;
		this.pourLe = pourLe;
	}

	public Tache(String libelle, int priorite, String etat, Date creation, Date pourLe) {
		super();
		this.libelle = libelle;
		this.priorite = priorite;
		this.etat = etat;
		this.creation = creation;
		this.pourLe = pourLe;
	}
	
	

	public Tache(String libelle, int priorite) {
		super();
		this.libelle = libelle;
		this.priorite = priorite;
		this.etat = "EA" ;
		this.creation = new Date() ;
	}

	public Tache(String libelle, int priorite, Date pourLe) {
		super();
		this.libelle = libelle;
		this.priorite = priorite;
		this.etat = "EA" ;
		this.creation = new Date() ;
		this.pourLe = pourLe;
	}

	public Tache() {
		super();
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

	public Date getCreation() {
		return creation;
	}

	public void setCreation(Date creation) {
		this.creation = creation;
	}

	public Date getPourLe() {
		return pourLe;
	}

	public void setPourLe(Date pourLe) {
		this.pourLe = pourLe;
	}

	@Override
	public String toString() {
		return "Tache [id=" + id + ", libelle=" + libelle + ", priorite=" + priorite + ", etat=" + etat + ", creation="
				+ creation + ", pourLe=" + pourLe + "]";
	}

	
}
