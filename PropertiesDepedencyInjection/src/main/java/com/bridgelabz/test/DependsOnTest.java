package com.bridgelabz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.model.A;

public class DependsOnTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("dependsOn.xml");
		//A a=(A) context.getBean("a");

	}
}
