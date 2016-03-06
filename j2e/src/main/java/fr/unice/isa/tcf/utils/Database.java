/*
 * Cette classe-ci peut avoir plusieurs colettions (HashMap, Set, Map, ArrayList, etc),
 *  une colection par chaque entité que l'on veut estoquer
 * .
 */

package fr.unice.isa.tcf.utils;

import java.util.*;

import javax.ejb.EJB;
import javax.ejb.Singleton;

import fr.unice.isa.tcf.entities.Usager;
import fr.unice.isa.tcf.entities.Vente;
import fr.unice.isa.tcf.entities.forfaits.Categorie;
import fr.unice.isa.tcf.entities.forfaits.Forfait;

/**
 *
 */

@Singleton
public class Database {

	
	private Map<Categorie,Set<Forfait>> forfaits = new HashMap<>();// base de forfaits par categories
	private Set<Forfait> allForfaits = new HashSet<>();// base de tous les forfaits
	private ArrayList<Vente> allVentes = new ArrayList<Vente>();
	private ArrayList<Usager> allUsager = new ArrayList<Usager>(); // base pour tous les clients
	private Vente ventePourRambourser; // ne sera pas à la base de donnée, mas sera donnée par l'entrée de donnée
	
	
	public Vente getVentePourRambourser() {
		return ventePourRambourser;
	}
	public void setVentePourRambourser(Vente ventePourRambourser) {
		this.ventePourRambourser = ventePourRambourser;
	}
	public void sortVente(){
		Collections.sort(allVentes);
	}
	public void flushForfaits() { forfaits =  new HashMap<Categorie,Set<Forfait>>();}

	public void flushVentes() { allVentes =  new ArrayList<Vente>();}

	public Map<Categorie,Set<Forfait>> getForfaits() {
		return forfaits;
	}

	public Set<Forfait> flushAllForfaits() { return new HashSet<>(); }

	public ArrayList<Vente> getVentes(){
		return allVentes;
	}

	public ArrayList<Integer> getArrayInt(){
		return new ArrayList<Integer>();
	}


	public ArrayList<Usager> getAllUsager() {
		return allUsager;
	}
	public void flush() {
		allVentes = new ArrayList<Vente>();
		forfaits =  new HashMap<Categorie,Set<Forfait>>();
		allForfaits = new HashSet<>();
		allUsager = new ArrayList<Usager>();
	}
}
