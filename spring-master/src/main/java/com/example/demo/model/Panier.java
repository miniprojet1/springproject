package com.example.demo.model;



import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;



@Entity
@Table(name="Panier")
@EntityListeners(AuditingEntityListener.class)

public class Panier {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private Double totale;
	private Double prix_article;
	private String nom_article;
    private int idclient;
    
    
    





	public int getIdclient() {
		return idclient;
	}













	public void setIdclient(int idclient) {
		this.idclient = idclient;
	}













	public Panier(int id, Double totale, Double prix_article, String nom_article) {
		super();
		this.id = id;
		this.totale = totale;
		this.prix_article = prix_article;
		this.nom_article = nom_article;
	}













	public int getId() {
		return id;
	}






	public void setId(int id) {
		this.id = id;
	}






	public Double getTotale() {
		return totale;
	}






	public void setTotale(Double totale) {
		this.totale = totale;
	}






	public Double getPrix_article() {
		return prix_article;
	}






	public void setPrix_article(Double prix_article) {
		this.prix_article = prix_article;
	}






	public String getNom_article() {
		return nom_article;
	}






	public void setNom_article(String nom_article) {
		this.nom_article = nom_article;
	}






	public Panier() {}
	
	
	



}
