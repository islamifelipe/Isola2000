/**
 * 
 */
package fr.unice.isa.tcf;

import static org.junit.Assert.*;

import javax.ejb.EJB;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import fr.unice.isa.tcf.entities.Vente;
import fr.unice.isa.tcf.entities.VenteCaisse;
import fr.unice.isa.tcf.interfaces.ILectureRemboucement;
import fr.unice.isa.tcf.interfaces.IRemboursement;
import fr.unice.isa.tcf.utils.Database;

/**
 * @author islamefelipefernandes
 *
 */
@RunWith(Arquillian.class)
public class ReboursementTest extends  AbstractTCFTest{
	@EJB(name = "reboursement") private  ILectureRemboucement lectureRemboucement;
	 @EJB(name = "vente-remboursement") IRemboursement venteRemboursement;
	@EJB Database memory;
	
	
	@Before
	@Test
	public void venteRemboucementDonnes(){
	    memory.setVentePourRambourser(null);
	    boolean re = lectureRemboucement.efecuterRemboucement(10);
	    assertFalse(re);
        Vente v1 = new VenteCaisse(1, "", "", 100, null, null, null);
		memory.getVentes().add(v1);
		venteRemboursement.setVente(1); // demande une remboussement de vente 1
		Vente v = lectureRemboucement.voirDetaillesVenteRemboucement();
		assertEquals(v1,v);
	}
	

	@Test
	public void efectuerRemboucementTest(){
		boolean re = lectureRemboucement.efecuterRemboucement(30);
		assertTrue(re);
		assertNull(memory.getVentePourRambourser());
		
	}
	
	
}
