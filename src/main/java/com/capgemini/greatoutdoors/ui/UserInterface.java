package com.capgemini.greatoutdoors.ui;

import java.util.Scanner;

import com.capgemini.greatoutdoors.dto.Address;
import com.capgemini.greatoutdoors.dto.PlaceAnOrder;
import com.capgemini.greatoutdoors.exception.InputMisMatchException;
import com.capgemini.greatoutdoors.service.AddressService;
import com.capgemini.greatoutdoors.service.AddressServiceImpl;
import com.capgemini.greatoutdoors.service.PlaceOrderServiceImpl;
import com.capgemini.greatoutdoors.util.AddressRepository;
import com.capgemini.greatoutdoors.util.PlaceOrderRepository;


public class UserInterface {

		public static void main(String[] args) {
			new AddressRepository();
			new PlaceOrderRepository();
			
			AddressService addressService=new AddressServiceImpl();
			
			
			System.out.println("choose"+"\n"+"1: view a address "+"\n"+"2: add a address "+"\n"+"3 update address"+"\n"+"4 : delete a address"
					+ "\n"+"5 : place a order");
			String choose ;
			Scanner scan = new Scanner(System.in);
			choose = scan.next();
		
			
			switch(choose)
			{
			case "1":
			 System.out.println("enter addressId");
			 String addressId;
				Scanner viewScan = new Scanner(System.in);
				addressId = viewScan.next();
				try {
					Address result=addressService.viewAllAddress(addressId);
					System.out.println("Address for given address ID : ");
					System.out.println(result.getAddressId()+" "+result.getBuildingNo()+" "+result.getCity()+" "+result.getState());
				}
				catch(InputMisMatchException e) {
					System.out.println(e.getMessage());
				}
				
						
			//System.out.println(obj.viewAllAddress(addressId));
				break;
			case "2":
				String addressId1;
				Scanner AddressScan = new Scanner(System.in);
				System.out.println("enter  address id");
				addressId1 =  AddressScan.next();
				System.out.println("enter  retailer id");
				String retailer = AddressScan.next();
				System.out.println("enter your building No");
				String building =  AddressScan.next();
				System.out.println("enter your city");
				String city =  AddressScan.next();
				System.out.println("enter your state");
				String state =  AddressScan.next();
				System.out.println("enter your feild");
				String feild =  AddressScan.next();
				System.out.println("enter zip code");
				String zip =  AddressScan.next();
				Address address1 = new Address();
				address1.setAddressId(addressId1);
				address1.setBuildingNo(building);
				address1.setCity(city);
				address1.setFeild(feild);
				address1.setRetailerId(retailer);
				address1.setState(state);
				address1.setZip(zip);
				try
				{
					boolean addAddress = addressService.addAddress(address1);
					if(addAddress)
						{
							System.out.println("Address Added Successfully");
						}
				}
				catch(InputMisMatchException e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case "3":
				System.out.println("enter an addressId to update");
				Scanner updateScan = new Scanner(System.in);
				String choice;
				choice = updateScan.next();
				String updateaddressId;
				System.out.println("enter  update address id");
				updateaddressId =  updateScan.next();
				System.out.println("enter update retailer id");
				String updateretailer = updateScan.next();
				System.out.println("enter your update building No");
				String updatebuilding =  updateScan.next();
				System.out.println("enter  update city");
				String updatecity =  updateScan.next();
				System.out.println("enter your state");
				String updatestate =  updateScan.next();
				System.out.println("enter update feild");
				String updatefeild =  updateScan.next();
				System.out.println("enter update code");
				String updatezip =  updateScan.next();
				Address address = new Address();
				address.setAddressId(updateaddressId);
				address.setBuildingNo(updatebuilding);
				address.setCity(updatecity);
				address.setFeild(updatefeild);
				address.setRetailerId(updateretailer);
				address.setState(updatestate);
				address.setZip(updatezip);
				try {
					boolean result = addressService.updateAddress(address,choice);
					if(result)
					{
						System.out.println("data  updated successfully");
					}
				} catch (InputMisMatchException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case "4":
				System.out.println("enter an address id to delete");
				Scanner deleteScan = new Scanner(System.in);
				String delete = deleteScan.next();
				try {
					boolean deleteAddress = addressService.deleteAddress(delete);
					if(deleteAddress)
					{
						System.out.println("Address Deleted Successfully");
					}
				} catch (InputMisMatchException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case "5":
				System.out.println("enter addressId");
				String checkAddressId;
				Scanner checkScan = new Scanner(System.in);
				checkAddressId = checkScan.next();
				PlaceOrderServiceImpl impl = new PlaceOrderServiceImpl();
				try {
					PlaceAnOrder output = impl.placeOrderPrice(checkAddressId);
					System.out.println("order placed Successfully : ");
					System.out.println("AddressId: "+output.getAddressId()+"\n"+"price : "+output.getPrice()+" \n"+"ProductId: "+output.getProductId()+" \n"+"UserId: "+output.getUserId());

				} catch (InputMisMatchException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				 break;
			default: 
				System.out.println("choose correct Number");
			}	
		}
}


	
