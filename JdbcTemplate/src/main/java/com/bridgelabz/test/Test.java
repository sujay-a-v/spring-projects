package com.bridgelabz.test;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.dao.EmployeeDao;
import com.bridgelabz.dao.NamedParameterDao;
import com.bridgelabz.dao.PreparedEmployeeDao;
import com.bridgelabz.dao.ResultSetEmployeeDao;
import com.bridgelabz.dao.RowMapperDao;
import com.bridgelabz.dao.SimpleJdbcDao;
import com.bridgelabz.model.Employee;


public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("employee.xml");
	
		
		/*EmployeeDao edao= (EmployeeDao) context.getBean("eDao");
		
		// insert
		int status=edao.insert(new Employee(4,"Manju",12000));
		System.out.println(status);*/
		
		// update
		/*int status=edao.update(new Employee(1,"Yogesh",16000));
		System.out.println(status);*/
		
		// delete 
		/*Employee employee=new Employee();
		employee.setId(2);
		int status=edao.delete(employee);
		System.out.println(status);*/
		
		// Insert using PreparedStatement
		/*PreparedEmployeeDao edao= (PreparedEmployeeDao) context.getBean("psEdao");
		edao.insertByPrepared(new Employee(3,"Pradeep",10000));*/
		
		
		//Retrieve using ResultSetExtractor
		/*ResultSetEmployeeDao rsdao= (ResultSetEmployeeDao) context.getBean("rsEdao");
		List<Employee> list=rsdao.getEmployeeData();
		Iterator itr=list.iterator();
		
		while(itr.hasNext())
		{
			Employee emp=(Employee) itr.next();
			System.out.print(emp.getId());
			System.out.print("\t"+emp.getName());
			System.out.println("\t"+emp.getSalary());
		}*/
		
		
		//Retrieve Using Rowmapping
		RowMapperDao rowmap= (RowMapperDao) context.getBean("rowMap");
		List<Employee> list1=rowmap.getEmployeeData();
		Iterator itr1=list1.iterator();
		
		while(itr1.hasNext())
		{
			Employee emp=(Employee) itr1.next();
			System.out.print(emp.getId());
			System.out.print("\t"+emp.getName());
			System.out.println("\t"+emp.getSalary());
		}
		
		// insert using namedParameter 
		/*NamedParameterDao namedParameter= (NamedParameterDao) context.getBean("named");
		namedParameter.insert(new Employee(25,"Yoga",15000));*/
		
		// update using SimpleJdbcTemplate
		SimpleJdbcDao sjDao= (SimpleJdbcDao) context.getBean("simpleJdbc");
		int status=sjDao.update(new Employee(2,"Yoga",5555));
		System.out.println(status);

	}

}
