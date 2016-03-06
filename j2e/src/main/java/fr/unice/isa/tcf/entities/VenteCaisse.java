package fr.unice.isa.tcf.entities;


/**
 * @author islamefelipefernandes
 *
 */

import fr.unice.isa.tcf.entities.forfaits.Forfait;

public class VenteCaisse extends Vente{
	private AgentCaisse agent;

	public VenteCaisse(int id, String date, String heure, double valeur, Usager client, Forfait forfait, AgentCaisse agent) {
		super();
		this.agent = agent;
		super.id = id;
		super.date = date;
		super.heure = heure;
		super.valeur = valeur;
		super.client = client;
		super.forfait = forfait;
	}

	public AgentCaisse getAgent() {
		return agent;
	}

	public void setAgent(AgentCaisse agent) {
		this.agent = agent;
	}

	@Override
	public int compareTo(Vente o) { // utilisé pour trier une liste de ventes
		 if (this.id < o.id) {
	            return -1;
	      }
	        if (this.id > o.id) {
	            return 1;
	        }
	        return 0;
	}


	
}
