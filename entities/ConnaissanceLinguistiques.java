package fr.binazon.entities;

public class ConnaissanceLinguistiques {
	private String refLinguistique;
	private String langueParlee;
	private String niveauLangue;
	
	public ConnaissanceLinguistiques() {
		// TODO Auto-generated constructor stub
	}

	public ConnaissanceLinguistiques(String refLinguistique, String langueParlee, String niveauLangue) {
		super();
		this.refLinguistique = refLinguistique;
		this.langueParlee = langueParlee;
		this.niveauLangue = niveauLangue;
	}

	public String getRefLinguistique() {
		return refLinguistique;
	}

	public void setRefLinguistique(String refLinguistique) {
		this.refLinguistique = refLinguistique;
	}

	public String getLangueParlee() {
		return langueParlee;
	}

	public void setLangueParlee(String langueParlee) {
		this.langueParlee = langueParlee;
	}

	public String getNiveauLangue() {
		return niveauLangue;
	}

	public void setNiveauLangue(String niveauLangue) {
		this.niveauLangue = niveauLangue;
	}
	
	
	
}
