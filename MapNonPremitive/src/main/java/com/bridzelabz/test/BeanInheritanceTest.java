package com.bridzelabz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.model.BeanInheritanceEmp;

public class BeanInheritanceTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("mapNonPremetive.xml");
		BeanInheritanceEmp emp=(BeanInheritanceEmp) context.getBean("e2");
		
		emp.display();
	}

}
