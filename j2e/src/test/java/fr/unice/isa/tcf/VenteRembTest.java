package fr.unice.isa.tcf;

import fr.unice.isa.tcf.components.VenteRemboursement;
import fr.unice.isa.tcf.entities.Vente;
import fr.unice.isa.tcf.entities.VenteCaisse;
import fr.unice.isa.tcf.entities.VenteSite;
import fr.unice.isa.tcf.interfaces.IRemboursement;
import fr.unice.isa.tcf.interfaces.IVente;
import fr.unice.isa.tcf.utils.Database;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;

import static org.junit.Assert.*;

import java.util.ArrayList;

@RunWith(Arquillian.class)
public class VenteRembTest extends AbstractTCFTest{

    @EJB private Database memory;
    @EJB(name = "vente-remboursement")
    IRemboursement venteRemboursement;

//    @Before
//    public void setUpContext() throws Exception { memory.flush(); }

    @Test
    @Before
    public void setVentesTest() {
        memory.setVentePourRambourser(null);
        Vente v1 = new VenteCaisse(1, "", "", 100, null, null, null);
		memory.getVentes().add(v1);
		venteRemboursement.setVente(1); // demande une remboussement de vente 1
		assertNotNull(memory.getVentePourRambourser());
		assertNotNull(venteRemboursement.getVente());
		assertEquals(venteRemboursement.getVente(), v1);
    }
    
    @Test
    public void resultatRemboursementTest() {
    	venteRemboursement.resultatRemboursement(true, memory.getVentePourRambourser(), 50);
    	assertNull(memory.getVentePourRambourser());
    }



}
