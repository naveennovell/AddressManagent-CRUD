package com.capgemini.greatoutdoors.util;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.greatoutdoors.dto.Address;


public class AddressRepository {
	
	public static List<Address>list = new ArrayList<Address>();
	static
	{
		Address address = new Address("101","201","6-32","hyderabad","telanagana","c.s.e","144411");
		Address addressDTO1 = new Address("102","202","7-34","hyderabad","telanagana","c.s.e","144411");
		Address addressDTO2 = new Address("103","203","6-33","karimnagar","telanagana","c.s.e","144411");
		Address addressDTO3 = new Address("104","204","6-35","nalgonda","telanagana","c.s.e","144411");
		Address addressDTO4 = new Address("105","205","10-32","vishakapatnam","Andhra","e.c.e","144411");
		Address addressDTO5 = new Address("106","206","0-22","coiambattur","tamil","e.c.e","501508");
		list.add(address);
		list.add(addressDTO1);
		list.add(addressDTO2);
		list.add(addressDTO3);
		list.add(addressDTO4);
		list.add(addressDTO5);
	
	
	}
	public static List<Address> getList() {
		return list;
	}
	
		
		
}
	