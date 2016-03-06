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
public class VenteRemboursement implements IRemboursement {


	@EJB Database memory;



	/*public Vente getVente(int id) {
		for (int i=0; i<memory.getVentes().size(); i++){
			if (memory.getVentes().get(i).getId() == id) return memory.getVentes().get(i);
		}
		return null; // si on donne un id qui n'existe pas
	}*/



	@Override
	public void resultatRemboursement(boolean resultat, Vente vent, double percentge) {
		
		if (resultat==true){
			double resul = (vent.getValeur()*percentge)/100;
			memory.setVentePourRambourser(null);
			System.out.println("Vous avez réussi votre remboursement.\n Valeur remboursée: "+resul);
		} else {
			System.out.println("Desolé!! Le remboursement n'a été pu effectué.");
		}
		
	}



	/** L'idee est que VenteRemboursement puisse recevoir du utilisateur, soit par ligne de commande, soit par interface grafique,
	 * l'id da vante qui va etre rembousée. Comme nous sommes, pour le moment, dans un contexte stateless, on 
	 * garde la variable qui indique la vante qui va etre rambousée dans memory. Donc, il faut la setter et la getter.
	 * Après, il foudra prendre la valeur du id et donner comme paramettre à la methode ci-dessous pour qu'elle puisse mettre à jour l'objet vente qui va être ramboursée
	 */
	@Override
	public void setVente(int id) {
		memory.setVentePourRambourser(null);
		for (int i=0; i<memory.getVentes().size(); i++){
			if (memory.getVentes().get(i).getId() == id)  memory.setVentePourRambourser(memory.getVentes().get(i));
		}
	}



	@Override
	public Vente getVente() {
		return memory.getVentePourRambourser();
	}

	
}
