package com.bridgelabz.model;

public class CarDependencyCheck {
	private String carname;
	private EngineDependencyCheck engine;
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public EngineDependencyCheck getEngine() {
		return engine;
	}
	public void setEngine(EngineDependencyCheck engine) {
		this.engine = engine;
	}
	
	public void display()
	{
		System.out.println(carname);
		System.out.println(engine.getModel());
	}

}
