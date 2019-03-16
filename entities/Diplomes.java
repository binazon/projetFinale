package fr.binazon.entities;

public class Diplomes {
	private String refDiplome;
	private long anneeObtention;
	private String mention;
	
	public Diplomes() {
		// TODO Auto-generated constructor stub
	}

	public Diplomes(String refDiplome, long anneeObtention, String mention) {
		super();
		this.refDiplome = refDiplome;
		this.anneeObtention = anneeObtention;
		this.mention = mention;
	}

	public String getRefDiplome() {
		return refDiplome;
	}

	public void setRefDiplome(String refDiplome) {
		this.refDiplome = refDiplome;
	}

	public long getAnneeObtention() {
		return anneeObtention;
	}

	public void setAnneeObtention(long anneeObtention) {
		this.anneeObtention = anneeObtention;
	}

	public String getMention() {
		return mention;
	}

	public void setMention(String mention) {
		this.mention = mention;
	}
	
	
}
