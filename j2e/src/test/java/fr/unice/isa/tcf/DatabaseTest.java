/**
 * 
 */
package fr.unice.isa.tcf;

import static org.junit.Assert.assertTrue;

import javax.ejb.EJB;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;

import fr.unice.isa.tcf.entities.AgentCaisse;
import fr.unice.isa.tcf.entities.Usager;
import fr.unice.isa.tcf.entities.Vente;
import fr.unice.isa.tcf.entities.VenteCaisse;
import fr.unice.isa.tcf.entities.VenteSite;
import fr.unice.isa.tcf.entities.forfaits.Forfait;
import fr.unice.isa.tcf.utils.Database;

/**
 * @author islamefelipefernandes
 *
 */
@RunWith(Arquillian.class)
public class DatabaseTest extends AbstractTCFTest{
	 @EJB private Database memory;
	 
	 @Test 
	 public void sortVenteTest(){
		 Vente v1 = new VenteCaisse(1, "", "", 0, null, null, null);
		 Vente v2 = new VenteSite(2, "", "", 0, null, null);
		 Vente v3 =  new VenteCaisse(3, "", "", 0, null, null,null );
		 Vente v4 =  new VenteSite(4, "", "", 0, null, null);
		 Vente v5 = new VenteCaisse(5, "", "", 0, null, null, null);
		 Vente v6 = new VenteSite(6, "", "", 0, null, null);
		 memory.getVentes().add(v2);
		 memory.getVentes().add(v5);
		 memory.getVentes().add(v4);
		 memory.getVentes().add(v1);
		 memory.getVentes().add(v3);
		 memory.getVentes().add(v6);
		 memory.sortVente();
		 for (int i=0; i<5; i++){
			// System.out.println((memory.getVentes().get(i).getId()));
			 assertTrue((memory.getVentes().get(i).getId() <= memory.getVentes().get(i+1).getId() ));
			
		 }
	 }
}
