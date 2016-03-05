/**
 * 
 */
package fr.unice.isa.tcf.entities;

import fr.unice.isa.tcf.entities.forfaits.Forfait;

/**
 * @author islamefelipefernandes
 *
 */
public class VenteSite extends Vente{
	
	public VenteSite(int id, String date, String heure, double valeur, Usager client, Forfait forfait) {
		super();
		super.id = id;
		super.date = date;
		super.heure = heure;
		super.valeur = valeur;
		super.client = client;
		super.forfait = forfait;
	}

	@Override
	public int compareTo(Vente o) { /// utilisé pour trier une liste de ventes
		 if (this.id < o.id) {
	            return -1;
	      }
	        if (this.id > o.id) {
	            return 1;
	        }
	        return 0;
	}
}
