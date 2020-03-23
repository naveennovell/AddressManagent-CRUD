package AddressDaoITestCases;

import static org.junit.Assert.assertEquals;
import java.util.Date;
import org.junit.Test;
import com.capgemini.greatoutdoors.dao.AddressDaoImpl;
import com.capgemini.greatoutdoors.dao.PlaceOrderDaoImpl;
import com.capgemini.greatoutdoors.dto.Address;
import com.capgemini.greatoutdoors.dto.PlaceAnOrder;

public class AddressDaoImplTestCases { 
	PlaceAnOrder obj = new PlaceAnOrder();
	AddressDaoImpl impl = new AddressDaoImpl();
	PlaceOrderDaoImpl  impl1 = new PlaceOrderDaoImpl();
	@Test
	public void viewAddressTest1()
	{
		
		  Address expected = null;
		  Address actual = impl.viewAllAddress("100001");
		   
		 assertEquals(expected, actual);
		
	}
	@Test
	public void viewAddressTest2()
	{
		
		  Address expected = new Address ("101","201","6-32","hyderabad","telanagana","c.s.e","144411");
		  Address actual = impl.viewAllAddress("101");
		   
		 assertEquals(expected, actual);
		
	}
	@Test
	public void addAddressTest()
	{
		
		  Address expected = new Address ("108","208","8-23","ludhiana","punjab","training","501508");
		  boolean actual = impl.addAddress(expected);
		   
		 assertEquals(true, actual);
		
	}
	@Test
	public void updateAddressTest()
	{
		
		  Address expected = new Address ("108","208","8-23","ludhiana","punjab","training","501508");
		  boolean actual = impl.updateAddress(expected,"101");
		  
		 assertEquals(true, actual);
		
	}
	
	@Test
	public void placeOrderTest()
	{
		Date d = new Date(2020/02/15);
		 PlaceAnOrder  expected = new  PlaceAnOrder ("101","A101","101",(byte)03,d,d,240.0);
		  PlaceAnOrder actual = impl1.placeOrderPrice("101");
		   
		 assertEquals(expected, actual);
		
	}
	
	@Test
	public void placeOrderTest1()
	{
		Date d = new Date(2020/02/15);
		 PlaceAnOrder  expected = null;
		  PlaceAnOrder actual = impl1.placeOrderPrice("100001");
		   
		 assertEquals(expected, actual);
		
	}
	

}
