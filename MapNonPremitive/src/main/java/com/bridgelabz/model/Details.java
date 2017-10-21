package com.bridgelabz.model;

public class Details {
	
	private long mobile;
	private String email;
	
	public Details(long mobile,String email) {
		this.email=email;
		this.mobile=mobile;
		
	}
	
	public String toString()
	{
		return mobile+" "+email;
	}

}
