package com.colourstar.springjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

public class StudentDAOImp implements StudentDAO 
{
	private DataSource data;
	
	public void 	setdata(DataSource kDataSource)
	{
		this.data = kDataSource;
	}
	
	public void 	InsertStudent(Student kStudent)
	{
		String sqlInsert = "INSERT INTO Student " + "(id,name,age) VALUES (?,?,?)";
		Connection conn = null;
		
		try 
		{
			conn = data.getConnection();
			PreparedStatement ps = conn.prepareStatement(sqlInsert);
			ps.setInt(1, kStudent.m_iID);
			ps.setString(2, kStudent.m_kName);
			ps.setInt(3, kStudent.m_iAge);
			
			ps.executeUpdate();
			
			ps.close();
		}
		catch (SQLException e)
		{
			throw new RuntimeException(e);
		}
		finally
		{
			if (conn != null)
			{
				try 
				{
					conn.close();
				}
				catch(SQLException e)
				{
					
				}
			}
		}
		
	}
	
	public Student 	GetStudent(int iID)
	{
		String sqlQuery = "SELECT * FROM Student WHERE id = ?";
		Connection conn = null;
		
		try 
		{
			conn = data.getConnection();
			PreparedStatement ps = conn.prepareStatement(sqlQuery);
			ps.setInt(1, iID);
			
			Student kStudent = null;
			ResultSet rs = ps.executeQuery();
			if (rs.next())
			{
				kStudent = new Student();
				kStudent.m_iID = rs.getInt("id");
				kStudent.m_kName = rs.getString("name");
				kStudent.m_iAge = rs.getInt("age");
			}
			
			rs.close();
			ps.close();
			
			return kStudent;
		}
		catch (SQLException e)
		{
			throw new RuntimeException(e);
		}
		finally
		{
			if (conn != null)
			{
				try 
				{
					conn.close();
				}
				catch(SQLException e)
				{
					
				}
			}
		}
		
	}

}
