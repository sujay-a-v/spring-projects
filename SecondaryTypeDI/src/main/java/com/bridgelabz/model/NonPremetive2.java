package com.bridgelabz.model;

public class NonPremetive2 {
	
	private int id;
	private String name;
	private long mobile;
	
	public NonPremetive2(int id,String name,long mobile) {
		this.id=id;
		this.name=name;
		this.mobile=mobile;
	}
	
	
	public String toString()
	{
		return id+" "+name+" "+mobile;
	}

}
