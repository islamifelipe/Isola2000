package fr.unice.isa.tcf.interfaces;


import fr.unice.isa.tcf.entities.Usager;
import fr.unice.isa.tcf.entities.Vente;
import fr.unice.isa.tcf.entities.forfaits.Forfait;

/*cette interface sera utilisée pour le composant VenteRemboursement pour treter les questions
 * de la comaande de la vente, como sa validation*/
public interface ICommande {

	Vente validerCommande(Usager usager, Forfait forfait, int quantite); 

	/*On ajoute plus des methodes au fur et à mesure*/

}
