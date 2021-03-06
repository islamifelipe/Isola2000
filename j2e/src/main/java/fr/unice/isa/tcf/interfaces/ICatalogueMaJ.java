/*
 * Cette interface-ci doit avoir toutes les methodes 
 * qui permetreront la lecture du cataloge de forfaits 
 * 
 */
package fr.unice.isa.tcf.interfaces;

import fr.unice.isa.tcf.entities.forfaits.Categorie;
import fr.unice.isa.tcf.entities.forfaits.Forfait;

import javax.ejb.Local;
import java.util.Map;
import java.util.Set;

/**
 * @author islamefelipefernandes
 *
 */
@Local
public interface ICatalogueMaJ {

	void addForfait(Forfait forfait);
	void modifyForfaits(Forfait forfait, double prix, int duree);
	void deleteForfaits(Forfait forfait);

	/*On ajoute plus des methodes au fur et à mesure*/
	
	
}
