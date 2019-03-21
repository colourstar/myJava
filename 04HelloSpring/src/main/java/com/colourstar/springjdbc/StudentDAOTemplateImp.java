package com.colourstar.springjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

public class StudentDAOTemplateImp implements StudentDAO
{
	private DataSource data;
	private JdbcTemplate jdbcTemp;
	
	public void 	setdata(DataSource kDataSource)
	{
		this.data = kDataSource;
	}
	
	public void 	InsertStudent(Student kStudent)
	{
		jdbcTemp = new JdbcTemplate(data);
		String sqlInsert = "INSERT INTO Student " + "(id,name,age) VALUES (?,?,?)";
		
		jdbcTemp.update(sqlInsert,new Object[] {kStudent.m_iID,kStudent.m_kName,kStudent.m_iAge});
	}
	
	public Student 	GetStudent(int iID)
	{
		String sqlQuery = "SELECT * FROM Student WHERE id = ?";
		
		Student kStudent = jdbcTemp.queryForObject(sqlQuery,new Object[] {iID},new StudentRowMapper());
		
		return kStudent;
	}
}
