/*
 * Cette interface-ci doit avoir toutes les methodes 
 * qui permetreront la lecture du cataloge de forfaits 
 * 
 */
package fr.unice.isa.tcf.interfaces;

import java.util.Map;
import java.util.Set;

import javax.ejb.Local;

import fr.unice.isa.tcf.entities.forfaits.Categorie;
import fr.unice.isa.tcf.entities.forfaits.Forfait;

/**
 * @author islamefelipefernandes
 *
 */
@Local
public interface ICatalogueLecture {

	Set<Forfait> getAllForfaits();
	Map<Categorie, Set<Forfait>> getForfaits(); // retourne tous les forfaits
	Set<Forfait> getForfaitsParCategorie(String categorie); // retourne les forfaits d'une categorie
	int getQuantity(String categorie); // retourne la quantité de forfait d'une categorie, pas d'un type (pas d'une sous-classe d'heritage)

	/*On ajoute plus des methodes au fur et à mesure*/
	
	
}
