package com.bridgelabz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.model.NonPremetive1;

public class NonPremetiveTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("secondaryData.xml");
		NonPremetive1 nonString= (NonPremetive1) context.getBean("frnd");
		nonString.display();
	}
}
