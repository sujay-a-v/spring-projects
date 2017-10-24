package com.bridgelabz.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bridgelabz.model.Employee;

public class EmployeeDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int insert(Employee employee)
	{
		int id=employee.getId();
		String name=employee.getName();
		int salary=employee.getSalary();
		
		String query="insert into Employee values("+id+",'"+name+"',"+salary+")";
		return jdbcTemplate.update(query);
	}
	
	public int update(Employee employee)
	{
		int id=employee.getId();
		String name=employee.getName();
		int salary=employee.getSalary();
		
		String query="update Employee set name='"+name+"',salary="+salary+" where id="+id+"";
		return jdbcTemplate.update(query);
		
	}
	
	public int delete(Employee employee)
	{
		int id=employee.getId();
		String query="delete from Employee where id="+id+" ";
		return jdbcTemplate.update(query);
		
	}

}
