/**
 * CECI C'EST UN COMPOSANT EXTERNE;
 * NE PAS CONFONDRE AVEC LE TYPE OBJECT USAGER
 */
package fr.unice.isa.tcf.components;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import fr.unice.isa.tcf.entities.Usager;
import fr.unice.isa.tcf.interfaces.IAutentification;
import fr.unice.isa.tcf.utils.Database;

/**
 * @author islamefelipefernandes
 *
 */
@Stateless(name = "client")
public class Client implements IAutentification {

	@EJB Database memory;
	
	@Override
	public Usager autentification(String id, String nom) {
		Usager user = null;
		for (int i=0; i< memory.getAllUsager().size(); i++){
			if (memory.getAllUsager().get(i).getId().equals(id) && memory.getAllUsager().get(i).getNom().equals(nom)){
				user = memory.getAllUsager().get(i);
			}
				
		}
		return user;
	}

	@Override
	public boolean cadastrer(String id, String prenom, String nom, String telephone) {
		Usager user = null;
		for (int i=0; i< memory.getAllUsager().size(); i++){
			if (memory.getAllUsager().get(i).getId().equals(id) && memory.getAllUsager().get(i).getNom().equals(nom)){
				return false; // si le client est déjà cadastré
			}
		}
		user = new Usager(id,prenom, nom,  telephone);
		memory.getAllUsager().add(user);
		return true;
	}

}
