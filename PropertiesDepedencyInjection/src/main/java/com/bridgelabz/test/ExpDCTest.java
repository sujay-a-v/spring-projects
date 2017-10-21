package com.bridgelabz.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.model.ExpDependencyCheck;

public class ExpDCTest {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("dependencyCheck.xml");
		ExpDependencyCheck dc= (ExpDependencyCheck) context.getBean("dc");
		dc.display();

	}

}
