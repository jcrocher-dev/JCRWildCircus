package com.wildcodeschool.JCRWildCircus.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Schedule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date date;
	private Date heure;
	private String lieu;
	private String adresse;
	private int cp;
	private String ville;
	@OneToMany(mappedBy = "schedule")
	private List<SpectacleEntitie> spectacleEntities = new ArrayList<>();
	
	
	public Schedule() {

	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Date getHeure() {
		return heure;
	}


	public void setHeure(Date heure) {
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


	public List<SpectacleEntitie> getSpectacleEntities() {
		return spectacleEntities;
	}


	public void setSpectacleEntities(List<SpectacleEntitie> spectacleEntities) {
		this.spectacleEntities = spectacleEntities;
	}

	
	
}
