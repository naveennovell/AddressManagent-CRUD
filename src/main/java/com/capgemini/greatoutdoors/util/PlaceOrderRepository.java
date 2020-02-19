package com.capgemini.greatoutdoors.util;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.greatoutdoors.dto.Address;
import com.capgemini.greatoutdoors.dto.PlaceAnOrder;

public class PlaceOrderRepository {
static	Date d = new Date(2020/02/15);
static	Date d1 = new Date(2020/03/15);
static	Date d2 = new Date(2020/04/13);
static Date d3 = new Date(2020/05/12);
static Date d4 = new Date(2020/06/1);

static 	List<PlaceAnOrder>place = new ArrayList();
	static {
		PlaceAnOrder placeorder = new PlaceAnOrder("101","A101","101",(byte)03,d,d,240.0);
		PlaceAnOrder placeorder1 = new PlaceAnOrder("102","A102","102",(byte)04,d1,d1,240.0);
		PlaceAnOrder placeorder2 = new PlaceAnOrder("103","A103","103",(byte)05,d2,d2,240.0);
		PlaceAnOrder placeorder3 = new PlaceAnOrder("104","A104","104",(byte)06,d3,d3,240.0);
		PlaceAnOrder placeorder4 = new PlaceAnOrder("105","A105","105",(byte)07,d4,d4,240.0);
		place.add(placeorder);
		place.add(placeorder1);
		place.add(placeorder2);
		place.add(placeorder3);
		place.add(placeorder4);		
		
		
		
		
	}
	public static List<PlaceAnOrder> getPlace() {
		return place;
}
}

