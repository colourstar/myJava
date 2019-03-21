package com.colourstar.springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper
{
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student customer = new Student();
		customer.m_iID = (rs.getInt("id"));
		customer.m_kName = (rs.getString("name"));
		customer.m_iAge = (rs.getInt("age"));
		return customer;
	}

}
