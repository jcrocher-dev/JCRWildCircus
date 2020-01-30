package com.wildcodeschool.JCRWildCircus.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;


@Entity
public class SpectacleEntitie {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String auteur;
	private String dateCreation;
	private String description;
	@Lob
	@Column
	private String longDescription;
	private String categorie;
	private String img1;
	private String img2;
	private String img3;
	private String duree;
	@OneToMany(mappedBy = "spectacleEntitie")
    private List<Schedule> schedules;
	
	
	public SpectacleEntitie() {

	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getAuteur() {
		return auteur;
	}


	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}


	public String getDateCreation() {
		return dateCreation;
	}


	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getLongDescription() {
		return longDescription;
	}


	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}


	public String getCategorie() {
		return categorie;
	}


	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}


	public String getImg1() {
		return img1;
	}


	public void setImg1(String img1) {
		this.img1 = img1;
	}


	public String getImg2() {
		return img2;
	}


	public void setImg2(String img2) {
		this.img2 = img2;
	}


	public String getImg3() {
		return img3;
	}


	public void setImg3(String img3) {
		this.img3 = img3;
	}


	public String getDuree() {
		return duree;
	}


	public void setDuree(String duree) {
		this.duree = duree;
	}


	public List<Schedule> getSchedules() {
		return schedules;
	}


	public void setSchedules(List<Schedule> schedules) {
		this.schedules = schedules;
	}


	

}
