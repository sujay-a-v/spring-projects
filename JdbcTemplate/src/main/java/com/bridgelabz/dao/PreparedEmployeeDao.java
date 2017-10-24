package com.bridgelabz.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.bridgelabz.model.Employee;


public class PreparedEmployeeDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public boolean insertByPrepared(Employee employee)
	{
		String query="insert into Employee values(?,?,?)";
		
		return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {
			
			@Override
			public Boolean doInPreparedStatement(PreparedStatement preparedStatement) throws SQLException
			{
				preparedStatement.setInt(1, employee.getId());
				preparedStatement.setString(2,employee.getName());
				preparedStatement.setInt(3, employee.getSalary());
				
				return preparedStatement.execute();
			}
		});
		
	}

}
