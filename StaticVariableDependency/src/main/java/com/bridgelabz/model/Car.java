package com.bridgelabz.model;

public class Car {

	private static String name;
	
	public static void setName(String name) {
		Car.name = name;
	}
	
	public static void display()
	{
		System.out.println("Car name : "+name);
	}
	
	
}
