package fr.unice.isa.tcf.interfaces;

import javax.ejb.Local;

import fr.unice.isa.tcf.entities.Usager;

/**
 * @author islamefelipefernandes
 *
 */

@Local
public interface IAutentification {
	
	Usager autentification(String id, String nom); // pour autentifiquer un client (comme un login)
	boolean cadastrer(String id, String prenom, String nom, String telephone);  // pour cadastrer un nouveau client
}
