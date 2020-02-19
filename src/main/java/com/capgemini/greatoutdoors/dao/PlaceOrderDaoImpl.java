package com.capgemini.greatoutdoors.dao;

import java.util.List;
import java.util.Scanner;

import com.capgemini.greatoutdoors.dto.Address;
import com.capgemini.greatoutdoors.dto.PlaceAnOrder;
import com.capgemini.greatoutdoors.util.AddressRepository;
import com.capgemini.greatoutdoors.util.PlaceOrderRepository;

public class PlaceOrderDaoImpl {
		public PlaceAnOrder placeOrderPrice(String address)
		{
			List<PlaceAnOrder>place = PlaceOrderRepository.getPlace();
			for(PlaceAnOrder i:place)
			{
				if(i.getAddressId().equals(address))
				
					return i;
			}
			return null;
		}
}
			
			

