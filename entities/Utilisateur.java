package fr.binazon.entities;

public abstract class Utilisateur {
	protected String login;
	protected String motPasse;
	protected String nom;
	protected String prenom;
	protected String adresse;
	
	abstract boolean ajouter();
	abstract boolean supprimer();
	abstract boolean consulter();
	abstract boolean modifier();
}
