package fr.unice.isa.tcf;


//import fr.unice.isa.tcf.components.CartStateFullBean;
//import fr.unice.isa.tcf.entities.Customer;
//import fr.unice.isa.tcf.exceptions.AlreadyExistingCustomerException;
import fr.unice.isa.tcf.components.CatalogueForfait;
import fr.unice.isa.tcf.interfaces.ICatalogue;
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
				.addPackage(ICatalogue.class.getPackage());
//				.addPackage(Customer.class.getPackage())
//				.addPackage(Cart.class.getPackage())
//				.addPackage(AlreadyExistingCustomerException.class.getPackage())
//				.addPackage(CartStateFullBean.class.getPackage());
	}

}
