package com.wildcodeschool.JCRWildCircus.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Schedule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String date;
	private String heure;
	private String lieu;
	private String adresse;
	private int cp;
	private String ville;
	@ManyToOne
    @JoinColumn(name= "spectacleEntitie_id")
    private SpectacleEntitie spectacleEntitie;
	
	
	public Schedule() {

	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getHeure() {
		return heure;
	}


	public void setHeure(String heure) {
		this.heure = heure;
	}


	public String getLieu() {
		return lieu;
	}


	public void setLieu(String lieu) {
		this.lieu = lieu;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public int getCp() {
		return cp;
	}


	public void setCp(int cp) {
		this.cp = cp;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public SpectacleEntitie getSpectacleEntitie() {
		return spectacleEntitie;
	}


	public void setSpectacleEntitie(SpectacleEntitie spectacleEntitie) {
		this.spectacleEntitie = spectacleEntitie;
	}



	
	
}
