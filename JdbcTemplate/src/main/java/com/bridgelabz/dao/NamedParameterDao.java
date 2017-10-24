package com.bridgelabz.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.bridgelabz.model.Employee;


public class NamedParameterDao {
	
	NamedParameterJdbcTemplate namedParameter;
	
	public NamedParameterDao(NamedParameterJdbcTemplate namedParameter) {
		this.namedParameter=namedParameter;
	}
	
	public void insert(Employee employee)
	{
		String query="insert into Employee values(:id,:name,:salary)";
		
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("id", employee.getId());
		map.put("name", employee.getName());
		map.put("salary", employee.getSalary());
		
		namedParameter.execute(query, map, new PreparedStatementCallback() {
			@Override
			public Object doInPreparedStatement(PreparedStatement preparedStatement) throws SQLException
			{
				return preparedStatement.executeUpdate();
			}
		});
	}

}
