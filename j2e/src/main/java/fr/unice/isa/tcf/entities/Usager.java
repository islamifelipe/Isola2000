/**
 * 
 */
package fr.unice.isa.tcf.entities;

/**
 * @author islamefelipefernandes
 *
 */
public class Usager {
	private String id;
	private String prenom;
	private String nom;
	private String telephone;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public Usager(String id, String prenom, String nom, String telephone) {
	
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.telephone = telephone;
	}
	
	
}
