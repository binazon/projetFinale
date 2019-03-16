package fr.binazon.entities;

import java.util.ArrayList;
import java.util.List;

public class Candidat extends Utilisateur {
	private String refCandidat;
	private List<OffreEmploi> offreEmplois;
	private List<DemandeEmploi> demandeEmplois;
	
	public Candidat() {
		offreEmplois = new ArrayList<OffreEmploi>();
		demandeEmplois = new ArrayList<DemandeEmploi>();
	}

	public Candidat(String refCandidat) {
		this.refCandidat = refCandidat;
		offreEmplois = new ArrayList<OffreEmploi>();
		demandeEmplois = new ArrayList<DemandeEmploi>();
	}

	public String getRefCandidat() {
		return refCandidat;
	}

	public void setRefCandidat(String refCandidat) {
		this.refCandidat = refCandidat;
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
