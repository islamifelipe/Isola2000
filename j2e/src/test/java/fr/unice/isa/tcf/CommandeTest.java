package fr.unice.isa.tcf;

import fr.unice.isa.tcf.entities.AgentCaisse;
import fr.unice.isa.tcf.entities.Usager;
import fr.unice.isa.tcf.entities.Vente;
import fr.unice.isa.tcf.entities.forfaits.Forfait;
import fr.unice.isa.tcf.interfaces.ICommande;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;
import java.util.ArrayList;

@RunWith(Arquillian.class)
public class CommandeTest extends AbstractTCFTest {
    @EJB(name = "commande") ICommande commande;

    private Usager usager;
    private Forfait forfait;
    private AgentCaisse agentCaisse;

    /**
     * Initialize a usager, agentCaisse and forfait for testing
     */
    @Before
    public void initialize() {
        usager = new Usager("1", "John", "Doe", "+336 00 00 00 00");
        forfait = new Forfait() {
            @Override
            public void sonnerSirene() {
                // "dring dring"
            }
        };
        agentCaisse = new AgentCaisse("Monsieur l'agent", "2", "+3232");
    }


    @Test
    public void commandeSizeTest() {
        ArrayList<Vente> myCart = commande.validerCommandeCaisse(usager, forfait, 2, agentCaisse);
        ArrayList<Vente> myWebCart = commande.validerCommandeSite(usager, forfait, 4);

        Assert.assertEquals(myCart.size(), 2);
        Assert.assertEquals(myWebCart.size(), 4);


    }

    @Test
    public void commandeClientTest() {
        ArrayList<Vente> myCart = commande.validerCommandeCaisse(usager, forfait, 2, agentCaisse);
        ArrayList<Vente> myWebCart = commande.validerCommandeSite(usager, forfait, 4);

        for (Vente v : myCart)
            Assert.assertEquals(v.getClient(), usager);

        for (Vente v : myWebCart)
            Assert.assertEquals(v.getClient(), usager);
    }

    @Test
    public void commandePrixTest() {
        ArrayList<Vente> myCart = commande.validerCommandeCaisse(usager, forfait, 2, agentCaisse);
        ArrayList<Vente> myWebCart = commande.validerCommandeSite(usager, forfait, 4);

        for (Vente v : myCart) {
//            System.out.println(v.getValeur());
//            Assert.assertEquals(v.getValeur(), 0);

        }
        for (Vente v : myWebCart) {
//            System.out.println(v.getValeur());
//            Assert.assertEquals(v.getValeur(), 0);
        }
    }

}
