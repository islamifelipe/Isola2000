package fr.unice.isa.tcf;


//import fr.unice.isa.tcf.components.CartStateFullBean;
//import fr.unice.isa.tcf.entities.Customer;
//import fr.unice.isa.tcf.exceptions.AlreadyExistingCustomerException;
import fr.unice.isa.tcf.components.CatalogueForfait;
import fr.unice.isa.tcf.components.Client;
import fr.unice.isa.tcf.components.Commande;
import fr.unice.isa.tcf.components.VenteRemboursement;

import fr.unice.isa.tcf.utils.Database;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;

public abstract class AbstractTCFTest {

	@Deployment
	public static WebArchive createDeployment() {
		return ShrinkWrap.create(WebArchive.class)
				.addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
				.addPackage(Database.class.getPackage())
				.addPackage(CatalogueForfait.class.getPackage())
				.addPackage(Client.class.getPackage())
				.addPackage(Commande.class.getPackage())
				.addPackage(VenteRemboursement.class.getPackage())
				;
//				.addPackage(Usager.class.getPackage())
//				.addPackage(VenteCaisse.class.getPackage())
//				.addPackage(VenteSite.class.getPackage())
//				.addPackage(AgentCaisse.class.getPackage())
//				.addPackage(Forfait.class.getPackage())
//				.addPackage(Vente.class.getPackage())
//				.addPackage(ICatalogueLecture.class.getPackage())
//				.addPackage(IAutentification.class.getPackage())
//				.addPackage(ICommande.class.getPackage())
//				.addPackage(IRemboursement.class.getPackage())
//				.addPackage(IVente.class.getPackage());
//				//.addPackage(Client.class.getPackage())
				
//				.addPackage(Cart.class.getPackage())
//				.addPackage(AlreadyExistingCustomerException.class.getPackage())
//				.addPackage(CartStateFullBean.class.getPackage());
	}

}
