package AddressDaoITestCases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.greatoutdoors.dao.AddressDaoImpl;
import com.capgemini.greatoutdoors.dto.Address;

public class AddressDaoTestCase {
	AddressDaoImpl impl = new AddressDaoImpl();
	@Test
	public void deleteAddressTest()
	{
		
		  boolean actual = impl.deleteAddress("101");
		   
		   //assertEquals(expected1, actual1);
		 assertEquals(true, actual);
		 //assertTrue(actual.equals(expected));
		
	}
	

}
