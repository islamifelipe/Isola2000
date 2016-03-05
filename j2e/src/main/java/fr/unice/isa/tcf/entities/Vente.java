/**
 * 
 */
package fr.unice.isa.tcf.entities;

import fr.unice.isa.tcf.entities.forfaits.Forfait;

/**
 * @author islamefelipefernandes
 *
 */
public abstract class Vente implements Comparable<Vente> {
	/*
	 * L'interface Comaprable<Vente> est utile pour trier une liste de Vente 
	 * */
	
	protected int id;
	protected String date;
	protected String heure;
	protected double valeur;
	protected Usager client;
	protected Forfait forfait;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Usager getClient() {
		return client;
	}
	public void setClient(Usager client) {
		this.client = client;
	}
	public Forfait getForfait() {
		return forfait;
	}
	public void setForfait(Forfait forfait) {
		this.forfait = forfait;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getHeure() {
		return heure;
	}
	public void setHeure(String heure) {
		this.heure = heure;
	}
	public double getValeur() {
		return valeur;
	}
	public void setValeur(double valeur) {
		this.valeur = valeur;
	}
	
	
	
}
