package fr.unice.isa.tcf.interfaces;


import java.util.ArrayList;

import javax.ejb.Local;

import fr.unice.isa.tcf.entities.AgenteCaisse;
import fr.unice.isa.tcf.entities.Usager;
import fr.unice.isa.tcf.entities.Vente;
import fr.unice.isa.tcf.entities.forfaits.Forfait;

/*cette interface sera utilisée pour le composant VenteRemboursement pour treter les questions
 * de la comaande de la vente, como sa validation*/
@Local
public interface ICommande {

	ArrayList<Vente> validerCommandeCaisse(Usager usager, Forfait forfait, int quantite, AgenteCaisse agent); 
	/*
	 * pourquoi retourner une lieste de ventes? Parce que un client peut acreter plusieur forfaits 
	 * (et un forfait d'un type et categorie peut être acheté pour plusieurs clientes)
	 */
	ArrayList<Vente> validerCommandeSite(Usager usager, Forfait forfait, int quantite); 
	/*On ajoute plus des methodes au fur et à mesure*/

}
