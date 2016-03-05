package fr.unice.isa.tcf;

import fr.unice.isa.tcf.components.VenteRemboursement;
import fr.unice.isa.tcf.utils.Database;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;
import java.util.ArrayList;

@RunWith(Arquillian.class)
public class VenteRembTest extends AbstractTCFTest{

    @EJB private Database memory;
    @EJB(name = "vente-remboursement")
    VenteRemboursement venteRemboursement;

//    @Before
//    public void setUpContext() throws Exception { memory.flush(); }

    @Test
    public void getVentesTest() {
        ArrayList<Integer> ventes =memory.getArrayInt();

    }



}
