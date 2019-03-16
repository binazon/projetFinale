package fr.binazon.entities;

import java.util.ArrayList;
import java.util.List;

public class Recruteur extends Utilisateur{
	private String refRecruteur;
	private List<OffreEmploi> offreEmplois;
	private List<DemandeEmploi> demandeEmplois;
	
	public Recruteur() {
		offreEmplois = new ArrayList<OffreEmploi>();
		demandeEmplois = new ArrayList<DemandeEmploi>();
	}
	
	public Recruteur(String refRecruteur) {
		this.refRecruteur = refRecruteur;
		offreEmplois = new ArrayList<OffreEmploi>();
		demandeEmplois = new ArrayList<DemandeEmploi>();
	}

	public String getRefRecruteur() {
		return refRecruteur;
	}

	public void setRefRecruteur(String refRecruteur) {
		this.refRecruteur = refRecruteur;
	}
	
	public List<OffreEmploi> getOffreEmplois() {
		return offreEmplois;
	}

	public void setOffreEmplois(List<OffreEmploi> offreEmplois) {
		this.offreEmplois = offreEmplois;
	}

	public List<DemandeEmploi> getDemandeEmplois() {
		return demandeEmplois;
	}

	public void setDemandeEmplois(List<DemandeEmploi> demandeEmplois) {
		this.demandeEmplois = demandeEmplois;
	}

	@Override
	public boolean ajouter() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean supprimer() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean consulter() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifier() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
