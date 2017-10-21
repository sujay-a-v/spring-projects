package com.bridgelabz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.model.CarAutowireAnnotation;

public class AnnotationTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("autowireAnnotation.xml");
		CarAutowireAnnotation car= (CarAutowireAnnotation) context.getBean("car");
		car.display();
	}

}
