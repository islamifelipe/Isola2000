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
	
	//Vente getVente(int id); // donne la vente à partir de son ID, laquelle on va essayer de rembousser
	void setVente(int id);  // donne l'id de la vente qui sera remboussée
	Vente getVente(); // donne la vente à que l'on va essayer de rembousser
	void resultatRemboursement(boolean resultat, Vente vent, double percentge); // prendre le resultat du rembousement. Le composant qui l'implement peut, par exemple, efficher une menssage en disant si le ramboussement a été efectué ou pas 
	/*On ajoute plus des methodes au fur et à mesure*/
	
}
