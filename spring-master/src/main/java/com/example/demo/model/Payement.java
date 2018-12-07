package com.example.demo.model;



import java.util.Date;

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
@Table(name="Payement")
@EntityListeners(AuditingEntityListener.class)

public class Payement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int id_fournisseur;
	private String date_ech_pre;
	private String mode_payement;
	private String date_ech_pro;
 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_fournisseur() {
		return id_fournisseur;
	}

	public void setId_fournisseur(int id_fournisseur) {
		this.id_fournisseur = id_fournisseur;
	}

	public String getDate_ech_pre() {
		return date_ech_pre;
	}

	public void setDate_ech_pre(String date_ech_pre) {
		this.date_ech_pre = date_ech_pre;
	}

	public String getMode_payement() {
		return mode_payement;
	}

	public void setMode_payement(String mode_payement) {
		this.mode_payement = mode_payement;
	}

	public String getDate_ech_pro() {
		return date_ech_pro;
	}

	public void setDate_ech_pro(String date_ech_pro) {
		this.date_ech_pro = date_ech_pro;
	}

	public Payement(int id, int id_fournisseur, String date_ech_pre, String mode_payement, String date_ech_pro) {
		super();
		this.id = id;
		this.id_fournisseur = id_fournisseur;
		this.date_ech_pre = date_ech_pre;
		this.mode_payement = mode_payement;
		this.date_ech_pro = date_ech_pro;
	}

	public Payement() {}
	
	
	



}
