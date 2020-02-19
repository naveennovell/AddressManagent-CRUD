package AddressServiceTestCases;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import com.capgemini.greatoutdoors.dto.Address;
import com.capgemini.greatoutdoors.exception.InputMisMatchException;
import com.capgemini.greatoutdoors.service.AddressServiceImpl;

public class AddressServiceImplTestCases {
	AddressServiceImpl impl =new  AddressServiceImpl();
	
	// -------> test case for View Address function <-------------//
	@Test
	public void viewAddressTest() throws InputMisMatchException
	{
		  Address actual = impl.viewAllAddress("101");
		  Address expected = new Address ("101","201","6-32","hyderabad","telanagana","c.s.e","144411");
		 assertEquals(expected, actual);
	}
	@Test(expected = InputMisMatchException.class)
	public void viewAddressTest1() throws InputMisMatchException 
	{
		  Address actual = impl.viewAllAddress("");
		 assertEquals("Address ID should not be null", actual);
		
	}
	@Test(expected = InputMisMatchException.class)
	public void viewAddressTest2() throws InputMisMatchException 
	{
		  Address actual = impl.viewAllAddress("108");
		 assertEquals("Address for gven Address ID is not found", actual);
		
	}
	
	
	//   ----------->  test case for add address function <----------//
	
	
	///test case for AddressServiceImpl class
	@Test(expected = InputMisMatchException.class)
	public void addAddress() throws InputMisMatchException 
	{
		
		 Address expected = new Address ("108","208","8-25","ludhiana","punjab","Devoloper","201508");
		  boolean actual = impl.addAddress(expected);
		 assertEquals(true, actual);
		
	}
	
	@Test(expected = InputMisMatchException.class)
	public void addAddress1() throws InputMisMatchException 
	{
		
		 Address expected = new Address ("108","201","","ludhiana","punjab","Devoloper","201508");
		  boolean actual = impl.addAddress(expected);
		 assertEquals("Building number should not be empty", actual);
		
	}
	
	@Test(expected = InputMisMatchException.class)
	public void addAddress2() throws InputMisMatchException
	{ 
		Address expected = new Address ("","201","8-23","ludhiana","punjab","Devoloper","201508");
		boolean actual = impl.addAddress(expected);
		 assertEquals("Address ID should not be empty", actual);
		
		}

	}