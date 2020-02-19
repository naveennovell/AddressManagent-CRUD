package com.capgemini.greatoutdoors.dto;

import java.util.Date;

public class PlaceAnOrder {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addressId == null) ? 0 : addressId.hashCode());
		result = prime * result + ((orderDispacthTime == null) ? 0 : orderDispacthTime.hashCode());
		result = prime * result + orderDispatchStatus;
		result = prime * result + ((orderInitaibleTime == null) ? 0 : orderInitaibleTime.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlaceAnOrder other = (PlaceAnOrder) obj;
		if (addressId == null) {
			if (other.addressId != null)
				return false;
		} else if (!addressId.equals(other.addressId))
			return false;
		if (orderDispacthTime == null) {
			if (other.orderDispacthTime != null)
				return false;
		} else if (!orderDispacthTime.equals(other.orderDispacthTime))
			return false;
		if (orderDispatchStatus != other.orderDispatchStatus)
			return false;
		if (orderInitaibleTime == null) {
			if (other.orderInitaibleTime != null)
				return false;
		} else if (!orderInitaibleTime.equals(other.orderInitaibleTime))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
	private String userId;
	private String productId;
	private String addressId;
	private byte orderDispatchStatus;
	private Date orderInitaibleTime;
	private Date orderDispacthTime;
	private double price;
	public PlaceAnOrder(String userId, String productId, String addressId, byte orderDispatchStatus,
			Date orderInitaibleTime, Date orderDispacthTime, double price) {
		super();
		this.userId = userId;
		this.productId = productId;
		this.addressId = addressId;
		this.orderDispatchStatus = orderDispatchStatus;
		this.orderInitaibleTime = orderInitaibleTime;
		this.orderDispacthTime = orderDispacthTime;
		this.price = price;
	}
	public PlaceAnOrder() {
		// TODO Auto-generated constructor stub
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public byte getOrderDispatchStatus() {
		return orderDispatchStatus;
	}
	public void setOrderDispatchStatus(byte orderDispatchStatus) {
		this.orderDispatchStatus = orderDispatchStatus;
	}
	public Date getOrderInitaibleTime() {
		return orderInitaibleTime;
	}
	public void setOrderInitaibleTime(Date orderInitaibleTime) {
		this.orderInitaibleTime = orderInitaibleTime;
	}
	public Date getOrderDispacthTime() {
		return orderDispacthTime;
	}
	public void setOrderDispacthTime(Date orderDispacthTime) {
		this.orderDispacthTime = orderDispacthTime;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
