package com.capgemini.greatoutdoors.dao;

import java.util.List;
import com.capgemini.greatoutdoors.dto.PlaceAnOrder;
import com.capgemini.greatoutdoors.util.PlaceOrderRepository;

public class PlaceOrderDaoImpl implements PlaceOrder{
		public PlaceAnOrder placeOrderPrice(String address)
		{
			List<PlaceAnOrder>place = PlaceOrderRepository.getPlace();
			for(PlaceAnOrder order:place)
			{
				if(order.getAddressId().equals(address))
				
					return order;
			}
			return null;
		}
}
			
			

