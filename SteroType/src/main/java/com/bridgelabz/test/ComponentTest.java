package com.bridgelabz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.model.Car;

public class ComponentTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("componentStero.xml");
		Car car= (Car) context.getBean(Car.class);
		car.display();
	}

}