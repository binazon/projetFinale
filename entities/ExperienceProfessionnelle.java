package fr.binazon.entities;

import java.util.Date;

public class ExperienceProfessionnelle {
	private String refProfessionnelle;
	private String posteOccupe;
	private String lieuExp;
	private Date dateDebut;
	private Date dateFin;
	
	public ExperienceProfessionnelle() {
		// TODO Auto-generated constructor stub
	}

	public ExperienceProfessionnelle(String refProfessionnelle, String posteOccupe, String lieuExp, Date dateDebut,
			Date dateFin) {
		super();
		this.refProfessionnelle = refProfessionnelle;
		this.posteOccupe = posteOccupe;
		this.lieuExp = lieuExp;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}

	public String getRefProfessionnelle() {
		return refProfessionnelle;
	}

	public void setRefProfessionnelle(String refProfessionnelle) {
		this.refProfessionnelle = refProfessionnelle;
	}

	public String getPosteOccupe() {
		return posteOccupe;
	}

	public void setPosteOccupe(String posteOccupe) {
		this.posteOccupe = posteOccupe;
	}

	public String getLieuExp() {
		return lieuExp;
	}

	public void setLieuExp(String lieuExp) {
		this.lieuExp = lieuExp;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
	
}
