package com.wildcodeschool.JCRWildCircus.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class SpectacleEntitie {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private Date dateCreation;
	private String description;
	private String categorie;
	private String img1;
	private String img2;
	private String img3;
	private int time;
	@ManyToOne
	@JoinColumn(name = "schedule_id")
	private Schedule schedule;
	
	
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


	public Date getDateCreation() {
		return dateCreation;
	}


	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
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


	public int getTime() {
		return time;
	}


	public void setTime(int time) {
		this.time = time;
	}


	public Schedule getSchedule() {
		return schedule;
	}


	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	
	
}
