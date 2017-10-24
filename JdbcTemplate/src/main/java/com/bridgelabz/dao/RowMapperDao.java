package com.bridgelabz.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bridgelabz.model.Employee;

public class RowMapperDao {
	
	private JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public List<Employee> getEmployeeData()
	{
		String query="select * from Employee";
		return  template.query(query,new RowMapper<Employee>() {
			@Override
			public Employee mapRow(ResultSet resultSet,int rowNumber) throws SQLException
			{
				Employee employee=new Employee();
				employee.setId(resultSet.getInt(1));
				employee.setName(resultSet.getString(2));
				employee.setSalary(resultSet.getInt(3));
				return employee;
			}
		});
	}

}
