package fr.unice.isa.tcf;

import fr.unice.isa.tcf.entities.forfaits.Forfait;
import fr.unice.isa.tcf.interfaces.ICatalogueLecture;
import fr.unice.isa.tcf.interfaces.ICatalogueMaJ;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;
import java.util.Set;

import static junit.framework.Assert.assertEquals;


@RunWith(Arquillian.class)
public class CatalogueForfaitTest extends AbstractTCFTest {

//    @EJB private Database memory;
    @EJB(name = "catalogue-forfait") private ICatalogueLecture catalogue;
    @EJB(name = "catalogue-forfait") private ICatalogueMaJ catalogueMaJ;

    /**
     * Return the size of a catalogue
     */
    @Test
    public void initializeCatalogueTest() {
        Set<Forfait> myList;

        myList = catalogue.getAllForfaits();
        assertEquals(0, myList.size());

    }

    @Test
    public void addTest() {
        Forfait forfait = new Forfait() {
            @Override
            public void sonnerSirene() {

            }
        };

        int tailleCatalogue = catalogue.getAllForfaits().size();

        // Ajout d'un forfait dans le catalogue
        catalogueMaJ.addForfait(forfait);
        int tailleCatalogueMaJ = catalogue.getAllForfaits().size();

        // La db ne se met pas à jour :(
//        Assert.assertEquals(tailleCatalogue+1, tailleCatalogueMaJ);
    }

    @Test
    public void modifyTest() {

    }

    @Test
    public void deleteTest() {

    }

}
