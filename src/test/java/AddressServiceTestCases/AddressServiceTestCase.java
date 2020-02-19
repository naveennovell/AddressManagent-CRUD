package AddressServiceTestCases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.greatoutdoors.dto.Address;
import com.capgemini.greatoutdoors.exception.InputMisMatchException;
import com.capgemini.greatoutdoors.service.AddressServiceImpl;

public class AddressServiceTestCase {
	AddressServiceImpl impl =new  AddressServiceImpl();
	
	
	//------->        test cases for Update function <-----------------------------//
	@Test(expected = Exception.class)
	public void updateAddress() throws InputMisMatchException 
	{
		
		 Address expected = new Address ("101","209","8-25","ludhiana","punjab","Devoloper","201508");
		  boolean actual = impl.updateAddress(expected,"101");
		 assertEquals(true, actual);
		
	}
	
	@Test(expected = Exception.class)
	public void update1() throws InputMisMatchException 
	{
		
		 Address expected = new Address ("","201","","ludhiana","punjab","Devoloper","201508");
		  boolean actual = impl.updateAddress(expected,"104");
		 assertEquals("Address number should not be empty", actual);
		
	}

	@Test(expected = Exception.class)
	public void update3() throws InputMisMatchException 
	{
		
		 Address expected = new Address ("101","201","8-23","ludhiana","punjab","Devoloper","201508");
		  boolean actual = impl.updateAddress(expected, "");
		 assertEquals("Address  should not be empty", actual);
	}
	
	
	//testcase for delete function//
		
	@Test(expected = Exception.class)
	public void delteTest() throws InputMisMatchException 
	{
		
		  boolean actual = impl.deleteAddress("");
		 assertEquals("Address ID should not be null", actual);
	}
	
	@Test(expected = Exception.class)
	public void delteTest1() throws InputMisMatchException 
	{
		
		  boolean actual = impl.deleteAddress("109");
		 assertEquals("Address not found on data", actual);
	}
	
	
	@Test(expected = Exception.class)
	public void delteTest2() throws InputMisMatchException 
	{
		  boolean actual = impl.deleteAddress("101");
		 assertEquals(true, actual);
	}
}


