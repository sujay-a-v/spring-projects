package com.bridgelabz.dao;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import com.bridgelabz.model.Employee;

public class SimpleJdbcDao {

	SimpleJdbcTemplate template;
	
	public SimpleJdbcDao(SimpleJdbcTemplate template) {
		this.template=template;
		
	}
	
	public int update(Employee employee)
	{
		String query="update Employee set name=?,salary=? where id=?";
		return template.update(query, employee.getName(),employee.getSalary(),employee.getId());
	}
}
