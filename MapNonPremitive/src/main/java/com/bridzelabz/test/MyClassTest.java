package com.bridzelabz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.model.MyClass;

public class MyClassTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("mapNonPremetive.xml");
		MyClass myclass=(MyClass) context.getBean("myclass");
		myclass.display();

	}

}
