package fr.unice.isa.tcf;

import com.sun.prism.Texture;
import fr.unice.isa.tcf.entities.AgenteCaisse;
import fr.unice.isa.tcf.entities.Usager;
import fr.unice.isa.tcf.entities.Vente;
import fr.unice.isa.tcf.entities.forfaits.Forfait;
import fr.unice.isa.tcf.interfaces.ICommande;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;
import java.util.ArrayList;

@RunWith(Arquillian.class)
public class CommandeTest extends AbstractTCFTest {
    @EJB(name = "commande") ICommande commande;

    @Test
    public void validerCommandeCaisseSizeTest() {
        Usager usager = new Usager("1", "John", "Doe", "+336 00 00 00 00");
        Forfait forfait = new Forfait() {
            @Override
            public void sonnerSirene() {
                // "dring dring"
            }
        };
        AgenteCaisse agenteCaisse = new AgenteCaisse("Monsieur l'agent", "2", "+3232");

        ArrayList<Vente> myCart = commande.validerCommandeCaisse(usager, forfait, 2, agenteCaisse);

        Assert.assertEquals(myCart.size(), 2);
    }

    @Test
    public void validerCommandeSite() {

    }
}
