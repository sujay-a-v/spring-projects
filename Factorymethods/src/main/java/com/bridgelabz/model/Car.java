package com.bridgelabz.model;

public class Car {
	
	private static Car c;
	
	private Car(){
		System.out.println("Car object");
	}
	
	public static Car getInstance()
	{
		if(c==null)
		{
			c=new Car();
		}
		return c;
		
		
	}
	private Object clo() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();

	}


}
