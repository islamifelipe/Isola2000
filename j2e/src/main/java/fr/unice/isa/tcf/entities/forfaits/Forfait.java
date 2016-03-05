/**
 * 
 */
package fr.unice.isa.tcf.entities.forfaits;

/**
 * @author islamefelipefernandes
 *
 */
public abstract class Forfait {
	protected double prix;
	protected boolean active;
	protected String dateAtivaton;
	protected String heureAtivation;
	protected Categorie categorie;
	protected int duree;
	protected int quantity;
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public abstract void sonnerSirene();

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getDateAtivaton() {
		return dateAtivaton;
	}

	public void setDateAtivaton(String dateAtivaton) {
		this.dateAtivaton = dateAtivaton;
	}

	public String getHeureAtivation() {
		return heureAtivation;
	}

	public void setHeureAtivation(String heureAtivation) {
		this.heureAtivation = heureAtivation;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}
	
	
	
}
