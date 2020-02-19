package com.capgemini.greatoutdoors.service;

import com.capgemini.greatoutdoors.dao.PlaceOrderDaoImpl;
import com.capgemini.greatoutdoors.dto.Address;
import com.capgemini.greatoutdoors.dto.PlaceAnOrder;
import com.capgemini.greatoutdoors.exception.InputMisMatchException;

public class PlaceOrderServiceImpl {
	PlaceOrderDaoImpl impl = new PlaceOrderDaoImpl();
	String result = " ";

	public PlaceAnOrder placeOrderPrice(String address) throws InputMisMatchException
	{
		if(address.isEmpty()) {
			throw new InputMisMatchException("Address ID should not be null");
		}
		
		PlaceAnOrder result=impl.placeOrderPrice(address);
		
		if(result==null) {
			throw new InputMisMatchException("Address for gven Address ID is not found");
		}
		else 
			return result;
	
	}
	
}
