/**
 * 
 */
package fr.unice.isa.tcf.interfaces;

import javax.ejb.Local;

import fr.unice.isa.tcf.entities.Usager;
import fr.unice.isa.tcf.entities.Vente;
import fr.unice.isa.tcf.entities.forfaits.Forfait;

/**
 * @author islamefelipefernandes
 *
 */

@Local
public interface IVente {

	Vente validerCommande(Usager usager, Forfait forfait, int quantite);

	/*On ajoute plus des methodes au fur et à mesure*/

}
