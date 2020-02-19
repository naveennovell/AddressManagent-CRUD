package com.capgemini.greatoutdoors.service;

import java.util.List;

import com.capgemini.greatoutdoors.dto.Address;

public interface AddressService {
	List<Address> viewAllAddress(String addressid);
	boolean addAddress( Address addressDTO);
	boolean updateAddress(Address addressDTO);
	boolean deleteAddress(Address adressDTO);	
}
