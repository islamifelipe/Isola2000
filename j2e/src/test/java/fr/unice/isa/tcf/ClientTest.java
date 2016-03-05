/**
 * 
 */
package fr.unice.isa.tcf;

import static org.junit.Assert.*;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;

import fr.unice.isa.tcf.components.Client;
import fr.unice.isa.tcf.entities.Usager;
import fr.unice.isa.tcf.interfaces.IAutentification;
import fr.unice.isa.tcf.utils.Database;

/**
 * @author islamefelipefernandes
 *
 */
@RunWith(Arquillian.class)
public class ClientTest extends AbstractTCFTest {
	  @EJB private Database memory;
	  @EJB(name = "client")private IAutentification client1;
	  
	  @Test
	  public void autentificationTest(){
		  
		  client1.cadastrer("FF12", "FELIPE2", "FERNANDES2", "11111111112");
		  client1.cadastrer("FF11", "FELIPE", "FERNANDES", "1111111111");
		  Usager user = client1.autentification("FF11", "FERNANDES");
		  Usager user2 = client1.autentification("FF12", "FERNANDES");
		  assertNotNull(user);
		  assertTrue(user.getPrenom().equals("FELIPE"));
		  assertNull(user2);
	  }
	  
	  @Test
	  public void cadastrerTest(){
		  memory.flush();
		  boolean b1 = client1.cadastrer("FF11", "FELIPE", "FERNANDES", "1111111111"); // true
		  boolean b2 = client1.cadastrer("FF11", "FELIPE3", "FERNANDES", "11111111113"); // false
		  assertEquals(1, memory.getAllUsager().size());
		 
		  assertTrue(b1);
		  assertFalse(b2);
		  assertEquals("FELIPE3", memory.getAllUsager().get(0).getPrenom());
		  
	  }
}
