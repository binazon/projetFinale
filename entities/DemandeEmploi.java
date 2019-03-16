package fr.binazon.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DemandeEmploi {
	private String refDemande;
	private Date dateDemande;
	private List<Formation> formations;
	private List<ConnaissanceLinguistiques> connaissanceLinguistiques;
	private List<ExperienceProfessionnelle> experienceProfessionnelles;
	private List<ConInformatiques> conInformatiques;
	private List<Diplomes> diplomes;
	
	public DemandeEmploi() {
		formations = new ArrayList<Formation>();
		connaissanceLinguistiques = new ArrayList<ConnaissanceLinguistiques>();
		experienceProfessionnelles = new ArrayList<ExperienceProfessionnelle>();
		conInformatiques = new ArrayList<ConInformatiques>();
		diplomes = new ArrayList<Diplomes>();
	}

	public DemandeEmploi(String refDemande, Date dateDemande) {
		super();
		this.refDemande = refDemande;
		this.dateDemande = dateDemande;
		formations = new ArrayList<Formation>();
		connaissanceLinguistiques = new ArrayList<ConnaissanceLinguistiques>();
		experienceProfessionnelles = new ArrayList<ExperienceProfessionnelle>();
		conInformatiques = new ArrayList<ConInformatiques>();
		diplomes = new ArrayList<Diplomes>();
	}

	public String getRefDemande() {
		return refDemande;
	}

	public void setRefDemande(String refDemande) {
		this.refDemande = refDemande;
	}

	public Date getDateDemande() {
		return dateDemande;
	}

	public void setDateDemande(Date dateDemande) {
		this.dateDemande = dateDemande;
	}

	public List<Formation> getFormations() {
		return formations;
	}

	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}

	public List<ConnaissanceLinguistiques> getConnaissanceLinguistiques() {
		return connaissanceLinguistiques;
	}

	public void setConnaissanceLinguistiques(List<ConnaissanceLinguistiques> connaissanceLinguistiques) {
		this.connaissanceLinguistiques = connaissanceLinguistiques;
	}

	public List<ExperienceProfessionnelle> getExperienceProfessionnelles() {
		return experienceProfessionnelles;
	}

	public void setExperienceProfessionnelles(List<ExperienceProfessionnelle> experienceProfessionnelles) {
		this.experienceProfessionnelles = experienceProfessionnelles;
	}

	public List<ConInformatiques> getConInformatiques() {
		return conInformatiques;
	}

	public void setConInformatiques(List<ConInformatiques> conInformatiques) {
		this.conInformatiques = conInformatiques;
	}

	public List<Diplomes> getDiplomes() {
		return diplomes;
	}

	public void setDiplomes(List<Diplomes> diplomes) {
		this.diplomes = diplomes;
	}
	
	
	
}
