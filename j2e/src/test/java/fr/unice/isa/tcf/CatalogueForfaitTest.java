package fr.unice.isa.tcf;

import fr.unice.isa.tcf.entities.forfaits.Forfait;
import fr.unice.isa.tcf.interfaces.ICatalogueLecture;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;
import java.util.Set;

import static junit.framework.Assert.assertEquals;


@RunWith(Arquillian.class)
public class CatalogueForfaitTest extends AbstractTCFTest {

//    @EJB private Database memory;
    @EJB(name = "catalogue-forfait") private ICatalogueLecture catalogue;


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
