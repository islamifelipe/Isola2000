package fr.unice.isa.tcf.components;

import fr.unice.isa.tcf.entities.Usager;
import fr.unice.isa.tcf.entities.Vente;
import fr.unice.isa.tcf.entities.VenteCaisse;
import fr.unice.isa.tcf.entities.VenteSite;
import fr.unice.isa.tcf.entities.forfaits.Forfait;
import fr.unice.isa.tcf.interfaces.ICommande;
import fr.unice.isa.tcf.utils.Database;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import fr.unice.isa.tcf.entities.AgenteCaisse;
/**
 * Created by mitsuko on 29/02/16.
 */

@Stateless(name = "commande")
public class Commande implements ICommande {
	@EJB Database memory;
   
	// avec cette methode, on n'a pas besoin des atributes globales 
	//d'instace "forfait" "client" et "quantite"
	@Override
	public ArrayList<Vente> validerCommandeCaisse(Usager usager, Forfait forfait, int quantite, AgenteCaisse agen) { 
		/* Les fonctons de validaction de comande suposent que l'usager existe (parce que il a fait deja son login
		 * En plus, quels sont les condictions pour valider la commande? Est-ce qu'il y a des condictions especiales
		 * Comme doit être fait le payment?
		 * */
			
		
		ArrayList<Vente> retorne  = new ArrayList<Vente> ();
		memory.sortVente();
		int id = -1;
		if (memory.getVentes().size()!=0) id= memory.getVentes().get(memory.getVentes().size()-1).getId();
		for (int i=0; i<quantite; i++){
			/* *****************  TESTER DATE ET HEURE   ************* */
			DateFormat date = new SimpleDateFormat("dd/MM/yyyy"); 
			DateFormat heure = new SimpleDateFormat("HH:mm:ss"); 
			Date datee = new Date();  
			String datahora = date.format(datee);

			
			Vente v = new VenteCaisse(++id, date.format(datee), heure.format(datee),forfait.getPrix(),  usager, forfait,  agen);
			retorne.add(v);
			memory.getVentes().add(v);
		}
		return retorne;
	}

	@Override
	public ArrayList<Vente> validerCommandeSite(Usager usager, Forfait forfait, int quantite) {
		// idem
		
		ArrayList<Vente> retorne  = new ArrayList<Vente> ();
		memory.sortVente();
		int id = -1;
		if (memory.getVentes().size()!=0) id= memory.getVentes().get(memory.getVentes().size()-1).getId();
		for (int i=0; i<quantite; i++){
			/* *****************  TESTER DATE ET HEURE   ************* */
			DateFormat date = new SimpleDateFormat("dd/MM/yyyy"); 
			DateFormat heure = new SimpleDateFormat("HH:mm:ss"); 
			Date datee = new Date();  
			String datahora = date.format(datee);

			
			Vente v = new VenteSite(++id, date.format(datee), heure.format(datee),forfait.getPrix(),  usager, forfait);
			retorne.add(v);
			memory.getVentes().add(v);
		}
		return retorne;
	}


}
