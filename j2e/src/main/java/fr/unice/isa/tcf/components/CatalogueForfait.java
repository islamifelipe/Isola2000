/**
 * 
 */
package fr.unice.isa.tcf.components;

import java.util.Map;
import java.util.Set;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import fr.unice.isa.tcf.entities.forfaits.Categorie;
import fr.unice.isa.tcf.entities.forfaits.Forfait;
import fr.unice.isa.tcf.interfaces.ICatalogueLecture;
import fr.unice.isa.tcf.interfaces.ICatalogueMaJ;
import fr.unice.isa.tcf.utils.Database;

/**
 * @author islamefelipefernandes
 *
 */
@Stateless(name = "catalogue-forfait")
public class CatalogueForfait implements ICatalogueLecture, ICatalogueMaJ {

	@EJB Database memory;

	@Override
	public Set<Forfait> getAllForfaits() {
		return memory.flushAllForfaits();
	}

	@Override
	public Map<Categorie,Set<Forfait>> getForfaits() {
		return memory.getForfaits();
	}

	@Override
	public Set<Forfait> getForfaitsParCategorie(String categorie) {
		return memory.getForfaits().get(categorie);
	}

	@Override
	public int getQuantity(String categorie) {
		return  memory.getForfaits().get(categorie).size(); // quantité de forfait d'une categorie, pas d'un type (sous-classe d'heritage)
	}

	//TODO
	@Override
	public void addForfait() {

	}

	//TODO
	@Override
	public void modifyForfaits() {

	}

	//TODO
	@Override
	public void deleteForfaits() {

	}
}
