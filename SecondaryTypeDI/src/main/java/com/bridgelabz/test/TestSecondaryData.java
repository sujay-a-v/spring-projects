package com.bridgelabz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.model.Car;

public class TestSecondaryData {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("secondaryData.xml");
		Car car=(Car) context.getBean("car");
		car.display();

		System.out.println("\nUsing inner Beans");
		Car car1=(Car) context.getBean("car1");
		car1.display();
	}

}
