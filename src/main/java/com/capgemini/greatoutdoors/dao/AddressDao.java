package com.capgemini.greatoutdoors.dao;

import com.capgemini.greatoutdoors.dto.Address;

public interface AddressDao {
	Address viewAllAddress(String addressId);
	boolean addAddress(Address addressobj);
	boolean updateAddress(Address address,String addressIdt);
	boolean deleteAddress(String address);	
}
