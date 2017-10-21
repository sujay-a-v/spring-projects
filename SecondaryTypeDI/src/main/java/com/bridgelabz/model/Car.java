package com.bridgelabz.model;

public class Car {
	private String carName;
	private Engine engine;
	
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void display()
	{
		System.out.println("Car name : "+carName);
		System.out.println("modal :"+engine.getModalyear());
	}

	public Car() {
		//System.out.println("Car Constructor");
	}
}
