/**
 * 
 */
package fr.unice.isa.tcf.interfaces;

import javax.ejb.Local;

import fr.unice.isa.tcf.entities.Vente;

/**
 * @author islamefelipefernandes
 *
 */
@Local
public interface IRemboursement {
	
	Vente getVente(int id); // donne la vente à partir de son ID, laquelle on va essayer de rembousser

	/*On ajoute plus des methodes au fur et à mesure*/
	
}
