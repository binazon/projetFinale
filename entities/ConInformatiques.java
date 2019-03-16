package fr.binazon.entities;

public class ConInformatiques {
	private String refInformatique;
	private String descLogiciel;
	private String systExploitation;
	private String Attribute1;
	
	public ConInformatiques() {
		// TODO Auto-generated constructor stub
	}

	public ConInformatiques(String refInformatique, String descLogiciel, String systExploitation, String attribute1) {
		super();
		this.refInformatique = refInformatique;
		this.descLogiciel = descLogiciel;
		this.systExploitation = systExploitation;
		Attribute1 = attribute1;
	}

	public String getRefInformatique() {
		return refInformatique;
	}

	public void setRefInformatique(String refInformatique) {
		this.refInformatique = refInformatique;
	}

	public String getDescLogiciel() {
		return descLogiciel;
	}

	public void setDescLogiciel(String descLogiciel) {
		this.descLogiciel = descLogiciel;
	}

	public String getSystExploitation() {
		return systExploitation;
	}

	public void setSystExploitation(String systExploitation) {
		this.systExploitation = systExploitation;
	}

	public String getAttribute1() {
		return Attribute1;
	}

	public void setAttribute1(String attribute1) {
		Attribute1 = attribute1;
	}
	
	
}
