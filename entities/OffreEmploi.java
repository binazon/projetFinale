package fr.binazon.entities;

import java.util.Date;

public class OffreEmploi {
	private String refEmploi;
	private String description;
	private Date dateOffre;
	
	public OffreEmploi() {
		// TODO Auto-generated constructor stub
	}

	public OffreEmploi(String refEmploi, String description, Date dateOffre) {
		super();
		this.refEmploi = refEmploi;
		this.description = description;
		this.dateOffre = dateOffre;
	}

	public String getRefEmploi() {
		return refEmploi;
	}

	public void setRefEmploi(String refEmploi) {
		this.refEmploi = refEmploi;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateOffre() {
		return dateOffre;
	}

	public void setDateOffre(Date dateOffre) {
		this.dateOffre = dateOffre;
	}
	
	
	
	
	
}
