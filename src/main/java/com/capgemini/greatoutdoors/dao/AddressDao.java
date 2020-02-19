package com.capgemini.greatoutdoors.dao;

import java.util.List;

import com.capgemini.greatoutdoors.dto.Address;

public interface AddressDao {
	List<Address> viewAllAddress(List<Address>list);
	boolean addAddress(List<Address>list);
	boolean updateAddress(List<Address>list);
	boolean deleteAddress(List<Address>list);	
}
