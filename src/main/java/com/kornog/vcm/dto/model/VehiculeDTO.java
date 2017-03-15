package com.kornog.vcm.dto.model;

import java.util.Date;

import com.kornog.vcm.dao.model.Client;
import com.kornog.vcm.dao.model.Modele;
import com.kornog.vcm.dao.model.Motorisation;

/***
 * 
 * @author gwenole
 *
 */
public class VehiculeDTO {

//	int id;
	String immat;
//	String vin;
//	int kilometrage;
//	Date date_premiere_immat;
//	Date date_dernier_controle_tech;
//	boolean actif;
//	Date creation_date;
//	Date updated_date;
//	Date deletion_date;
//	Motorisation motorisation;
//	Client client;
//	Modele modele;

	/**
	 * 
	 * @param immat
	 */
	public VehiculeDTO(String immat) {
		super();
		this.immat = immat;
	}

	/**
	 * 
	 */
	public VehiculeDTO() {
		// TODO Auto-generated constructor stub
	}

//	/**
//	 * 
//	 * @return l'id du véhicule
//	 */
//	public int getId() {
//		return id;
//	}
//
//	/**
//	 * 
//	 * @param id
//	 */
//	public void setId(int id) {
//		this.id = id;
//	}

	/**
	 * 
	 * @return l'immatriculation du véhicule
	 */
	public String getImmat() {
		return immat;
	}

	/**
	 * 
	 * @param immat
	 */
	public void setImmat(String immat) {
		this.immat = immat;
	}

//	/**
//	 * 
//	 * @return le numéro vin courant
//	 */
//	public String getVin() {
//		return vin;
//	}
//
//	/**
//	 * 
//	 * @param vin
//	 */
//	public void setVin(String vin) {
//		this.vin = vin;
//	}
//
//	/**
//	 * 
//	 * @return le kilométrage courant
//	 */
//	public int getKilometrage() {
//		return kilometrage;
//	}
//
//	/**
//	 * 
//	 * @param kilometrage
//	 */
//	public void setKilometrage(int kilometrage) {
//		this.kilometrage = kilometrage;
//	}
//
//	/**
//	 * 
//	 * @return la date de la première immatriculation
//	 */
//	public Date getDate_premiere_immat() {
//		return date_premiere_immat;
//	}
//
//	/**
//	 * 
//	 * @param date_premiere_immat
//	 */
//	public void setDate_premiere_immat(Date date_premiere_immat) {
//		this.date_premiere_immat = date_premiere_immat;
//	}
//
//	/**
//	 * 
//	 * @return la date du dernier contrôle technique
//	 */
//	public Date getDate_dernier_controle_tech() {
//		return date_dernier_controle_tech;
//	}
//
//	/**
//	 * 
//	 * @param date_dernier_controle_tech
//	 */
//	public void setDate_dernier_controle_tech(Date date_dernier_controle_tech) {
//		this.date_dernier_controle_tech = date_dernier_controle_tech;
//	}
//
//	/**
//	 * 
//	 * @return si le véhicule est actif
//	 */
//	public boolean isActif() {
//		return actif;
//	}
//
//	/**
//	 * 
//	 * @param actif
//	 */
//	public void setActif(boolean actif) {
//		this.actif = actif;
//	}
//
//	/**
//	 * 
//	 * @return la date de création courante
//	 */
//	public Date getCreation_date() {
//		return creation_date;
//	}
//
//	/**
//	 * 
//	 * @param creation_date
//	 */
//	public void setCreation_date(Date creation_date) {
//		this.creation_date = creation_date;
//	}
//
//	/**
//	 * 
//	 * @return la date de mise à jour courante
//	 */
//	public Date getUpdated_date() {
//		return updated_date;
//	}
//
//	/**
//	 * 
//	 * @param updated_date
//	 */
//	public void setUpdated_date(Date updated_date) {
//		this.updated_date = updated_date;
//	}
//
//	/**
//	 * 
//	 * @return la date de suppression courante
//	 */
//	public Date getDeletion_date() {
//		return deletion_date;
//	}
//
//	/**
//	 * 
//	 * @param deletion_date
//	 */
//	public void setDeletion_date(Date deletion_date) {
//		this.deletion_date = deletion_date;
//	}
//
//	/**
//	 * 
//	 * @return la motorisation courante
//	 */
//	public Motorisation getMotorisation() {
//		return motorisation;
//	}
//
//	/**
//	 * 
//	 * @param motorisation
//	 */
//	public void setMotorisation(Motorisation motorisation) {
//		this.motorisation = motorisation;
//	}
//
//	/**
//	 * 
//	 * @return le client courant
//	 */
//	public Client getClient() {
//		return client;
//	}
//
//	/**
//	 * 
//	 * @param client
//	 */
//	public void setClient(Client client) {
//		this.client = client;
//	}
//
//	/**
//	 * 
//	 * @return le modèle courant
//	 */
//	public Modele getModele() {
//		return modele;
//	}
//
//	/**
//	 * 
//	 * @param modele
//	 */
//	public void setModele(Modele modele) {
//		this.modele = modele;
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		VehiculeDTO other = (VehiculeDTO) obj;
//		if (id != other.id)
//			return false;
//		return true;
//	}

	@Override
	public String toString() {
		return "Vehicule [immat=" + immat + "]";
	}
}
