package com.bridgelabz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.model.MapExample;

public class MapTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("secondaryData.xml");
		MapExample mapExample= (MapExample) context.getBean("mapFrnd");
		mapExample.display();

	}

}
