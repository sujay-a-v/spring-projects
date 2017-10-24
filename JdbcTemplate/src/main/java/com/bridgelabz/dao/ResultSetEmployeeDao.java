package com.bridgelabz.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.bridgelabz.model.Employee;


public class ResultSetEmployeeDao {
	
	private JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public List<Employee> getEmployeeData()
	{
		String query="select * from Employee";
		return template.query(query, new ResultSetExtractor<List<Employee>>(){
			@Override
			public List<Employee> extractData(ResultSet resultSet) throws SQLException
			{
				List<Employee> list=new ArrayList<Employee>();
				while(resultSet.next())
				{
					Employee employee=new Employee();
					employee.setId(resultSet.getInt(1));
					employee.setName(resultSet.getString(2));
					employee.setSalary(resultSet.getInt(3));
					list.add(employee);
				}
				return list;
			}
		} );
	}

}
