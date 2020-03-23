package com.capgemini.greatoutdoors.service;

import com.capgemini.greatoutdoors.dto.PlaceAnOrder;
import com.capgemini.greatoutdoors.exception.InputMisMatchException;

public interface PlaceOrder {
	public PlaceAnOrder placeOrderPrice(String address) throws InputMisMatchException;

}
