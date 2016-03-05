package fr.unice.isa.tcf.components;

import fr.unice.isa.tcf.entities.Usager;
import fr.unice.isa.tcf.entities.Vente;
import fr.unice.isa.tcf.entities.forfaits.Forfait;
import fr.unice.isa.tcf.interfaces.ICommande;

import javax.ejb.Stateless;

/**
 * Created by mitsuko on 29/02/16.
 */

@Stateless(name = "commande")
public class Commande implements ICommande {
   /* private Usager client;
    private Forfait forfait;
    private int quantite;

    public Usager getClient() {
		return client;
	}

	public Forfait getForfait() {
		return forfait;
	}

	public int getQuantity() {
		return quantite;
	}*/

	// avec cette methode, on n'a pas besoin des atributes globales 
	//d'instace "forfait" "client" et "quantite"
	@Override
	public Vente validerCommande(Usager usager, Forfait forfait, int quantite) { 
		// TODO Auto-generated method stub
		return null;
	}


}
