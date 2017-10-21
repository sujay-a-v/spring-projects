package com.bridgelabz.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired()
	private Engine engine;
	
	//no need to have any setter and constructor  

	public void display()
	{
		System.out.println("car model : "+engine.getModel());
	}
}
