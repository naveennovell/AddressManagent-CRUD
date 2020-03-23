package com.capgemini.greatoutdoors.dao;

import java.util.List;
import com.capgemini.greatoutdoors.dto.Address;
import com.capgemini.greatoutdoors.util.AddressRepository;

public class AddressDaoImpl implements AddressDao {
	public Address viewAllAddress(String addressId)
	{
		
		List<Address> list= AddressRepository.getList();
		
		for(Address address: list )
		{
			if(address.getAddressId().equalsIgnoreCase(addressId))
			{
				return address;
			}
		}
		return null;
		
	}
	public boolean addAddress(Address addressObj)
	{ 
		
		List<Address>addressList =AddressRepository.getList();
		
		boolean result=addressList.add(addressObj);
		 
		return result;
	}

	public boolean updateAddress(Address address,String addressId)
	{
		boolean update = false;
		List<Address>list = AddressRepository.getList();
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getAddressId().equals(addressId))
			{
				list.get(i).setBuildingNo(address.getBuildingNo());
				list.get(i).setCity(address.getCity());
				list.get(i).setState(address.getZip());
				list.get(i).setFeild(address.getFeild());
			    update = true;
			}
			   
	    }
	    return update;
	}
	public boolean deleteAddress(String address)
	{
		boolean del = false;
		List<Address>list = AddressRepository.getList();
	    for (java.util.Iterator<Address> iterator = list.iterator(); iterator.hasNext();) {
			  Address obj= iterator.next();
			    if (obj.getAddressId().equals(address)) {
			       // Remove the current element from the iterator and the list.
			       iterator.remove();
			       del = true;
			    }
		}
		return del;
		
	}
}


