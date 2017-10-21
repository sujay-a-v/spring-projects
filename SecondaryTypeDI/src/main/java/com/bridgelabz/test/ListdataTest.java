package com.bridgelabz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.model.ListData;

public class ListdataTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("secondaryData.xml");
		ListData listData=(ListData) context.getBean("listdata");
		listData.display();

	}

}
