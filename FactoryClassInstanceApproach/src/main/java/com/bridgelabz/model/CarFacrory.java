package com.bridgelabz.model;

public class CarFacrory {
	
	private String carname;
	
	public void setCarname(String carname) {
		this.carname = carname;
	}
	
	//non-static or Instance approach
	public Car getInstance() throws Exception
	{
		Car c=(Car) Class.forName(carname).newInstance();
		return c;
	}

}
