package fr.unice.isa.tcf;

import fr.unice.isa.tcf.components.CatalogueForfait;
import fr.unice.isa.tcf.entities.forfaits.Categorie;
import fr.unice.isa.tcf.entities.forfaits.Forfait;
import fr.unice.isa.tcf.interfaces.ICatalogue;
import fr.unice.isa.tcf.utils.Database;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static junit.framework.Assert.assertEquals;


@RunWith(Arquillian.class)
public class CatalogueForfaitTest extends AbstractTCFTest {

//    @EJB private Database memory;
    @EJB(name = "catalogue-forfait") private ICatalogue catalogue;


    /**
     * Return the size of a catalogue
     */
    @Test
    public void initializeCatalogueTest() {
    	if (catalogue == null) System.out.println("NULLLLLLLLLLLO");
    	
        Set<Forfait> myList;

//        myList = new HashSet<>();
        myList = catalogue.getAllForfaits();
//        myList = memory.flushAllForfaits();

        assertEquals(0, myList.size());

    }
    
}
