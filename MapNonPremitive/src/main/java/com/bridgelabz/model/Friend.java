package com.bridgelabz.model;

public class Friend {
	
	private int id;
	private String name;
	
	public Friend(int id,String name) {
		this.id=id;
		this.name=name;
	}

	public String toString()
	{
		return id+" "+name;
	}
}
