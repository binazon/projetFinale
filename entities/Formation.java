package fr.binazon.entities;

public class Formation {
	private String refFormation;
	private String diplome;
	private String lieuFormation;
	private double dureeFormation;
	
	public Formation() {
		// TODO Auto-generated constructor stub
	}

	public Formation(String refFormation, String diplome, String lieuFormation, double dureeFormation) {
		super();
		this.refFormation = refFormation;
		this.diplome = diplome;
		this.lieuFormation = lieuFormation;
		this.dureeFormation = dureeFormation;
	}

	public String getRefFormation() {
		return refFormation;
	}

	public void setRefFormation(String refFormation) {
		this.refFormation = refFormation;
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	public String getLieuFormation() {
		return lieuFormation;
	}

	public void setLieuFormation(String lieuFormation) {
		this.lieuFormation = lieuFormation;
	}

	public double getDureeFormation() {
		return dureeFormation;
	}

	public void setDureeFormation(double dureeFormation) {
		this.dureeFormation = dureeFormation;
	}
	
	
}
