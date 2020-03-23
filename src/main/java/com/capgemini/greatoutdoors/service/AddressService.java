package com.capgemini.greatoutdoors.service;

import com.capgemini.greatoutdoors.dto.Address;
import com.capgemini.greatoutdoors.exception.InputMisMatchException;

public interface AddressService {
	public Address viewAllAddress(String addressId) throws InputMisMatchException;
	public boolean addAddress(Address obj) throws InputMisMatchException;
	public boolean updateAddress(Address obj,String address) throws InputMisMatchException;
	public boolean deleteAddress(String address) throws InputMisMatchException;	
}
