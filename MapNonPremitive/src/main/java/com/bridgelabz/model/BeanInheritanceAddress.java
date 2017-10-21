package com.bridgelabz.model;

public class BeanInheritanceAddress {
	private String addressLine1,city,state,country;
	
	public BeanInheritanceAddress(String addressLine1,String city,String state,String country) {
		
		this.addressLine1=addressLine1;
		this.city=city;
		this.state=state;
		this.country=country;
		
	}

	public String toString()
	{
		return addressLine1+" "+city+" "+state+" "+country;
	}
}
