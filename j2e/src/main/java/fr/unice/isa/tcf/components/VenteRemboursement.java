/**
 * 
 */
package fr.unice.isa.tcf.components;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import fr.unice.isa.tcf.entities.Usager;
import fr.unice.isa.tcf.entities.Vente;
import fr.unice.isa.tcf.entities.forfaits.Forfait;
import fr.unice.isa.tcf.interfaces.IRemboursement;
import fr.unice.isa.tcf.interfaces.IVente;
import fr.unice.isa.tcf.utils.Database;

/**
 * @author islamefelipefernandes
 *
 */
@Stateless(name = "vente-remboursement")
public class VenteRemboursement implements IVente, IRemboursement {


	@EJB Database memory; // composante

//	public Usager getClient() {
//		return client;
//	}
//
//	public Forfait getForfait() {
//		return forfait;
//	}
//
//	public int getQuantity() {
//		return quantite;
//	}

	public Vente getVente(int id) {
		for (int i=0; i<memory.getVentes().size(); i++){
			if (memory.getVentes().get(i).getId() == id) return memory.getVentes().get(i);
		}
		return null; // si on donne un id qui n'existe pas
	}

	@Override
	public Vente validerCommande(Usager usager, Forfait forfait, int quantite) {
		return null; // TODO
	}
}
