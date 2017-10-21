package com.bridgelabz.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.model.Car;

public class StaticTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("staticVariable.xml");
		Car c=(Car) context.getBean("c");
		c.display();
	}
}
