package com.org.demo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImp implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;
	
	
	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	public String getEmployeeName(int id) {
		// TODO Auto-generated method stub
		String sql="select name from Emp where id= ?";
		String name=jdbcTemplate.queryForObject(sql, new Object[] {id} ,String.class);
		return name;
	}

}
