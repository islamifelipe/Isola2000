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

@Stateless(name = "commande")
public class Commande implements ICommande {
	@EJB Database memory;
   
	// avec cette methode, on n'a pas besoin des atributes globales 
	//d'instace "forfait" "client" et "quantite"
	@Override
	public ArrayList<Vente> validerCommandeCaisse(Usager usager, Forfait forfait, int quantite, AgenteCaisse agent) {
		/* Les fonctons de validation de commande suppose que l'usager existe (parce que il a fait deja son login
		 * En plus, quelles sont les conditions pour valider la commande? Est-ce qu'il y a des conditions speciales
		 * Comment doit être fait le paiement?
		 * */
			
		
		ArrayList<Vente> cart  = new ArrayList<Vente> ();
		memory.sortVente();
		int id = memory.getVentes().get(memory.getVentes().size()-1).getId();
		for (int i=0; i<quantite; i++){
			/* *****************  TESTER DATE ET HEURE   ************* */
			DateFormat date = new SimpleDateFormat("dd/MM/yyyy"); 
			DateFormat heure = new SimpleDateFormat("HH:mm:ss"); 
			Date datee = new Date();  
			String datahora = date.format(datee);

			
			Vente v = new VenteCaisse(++id, date.format(datee), heure.format(datee),forfait.getPrix(),  usager, forfait,  agent);
			cart.add(v);
			memory.getVentes().add(v);
		}
		return cart;
	}

	@Override
	public ArrayList<Vente> validerCommandeSite(Usager usager, Forfait forfait, int quantite) {
		// idem
		
		ArrayList<Vente> cart  = new ArrayList<Vente> ();
		memory.sortVente();
		int id = memory.getVentes().get(memory.getVentes().size()-1).getId();
		for (int i=0; i<quantite; i++){
			/* *****************  TESTER DATE ET HEURE   ************* */
			DateFormat date = new SimpleDateFormat("dd/MM/yyyy"); 
			DateFormat heure = new SimpleDateFormat("HH:mm:ss"); 
			Date datee = new Date();  
			String datahora = date.format(datee);

			
			Vente v = new VenteSite(++id, date.format(datee), heure.format(datee),forfait.getPrix(),  usager, forfait);
			cart.add(v);
			memory.getVentes().add(v);
		}
		return cart;
	}


}
