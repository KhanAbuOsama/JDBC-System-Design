package com.jsp.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.student.dto.Student;
import com.jsp.student.util.HelperClass;

public class StudentDao {
	
	HelperClass Helperclass = new HelperClass();
	
   public Student saveStudent(Student student)	{
	   Connection connection =Helperclass.getConnection();
	   String sql = " INSERT INTO student VALUES(?,?,?)";
	   try {
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setInt(1, student.getId());
		preparedStatement.setString(2, student.getName());
		preparedStatement.setString(3, student.getEmail());
		
		
		preparedStatement.execute();
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   finally {
		   try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }

	return  new Student();
	   
	
	   
   }
   public void Delete(int id) {
	   Connection connection =Helperclass.getConnection();
	   String sqldelete = "DELETE FROM student WHERE ID= ?";
	   try {
		PreparedStatement preparedStatement=connection.prepareStatement(sqldelete);
		preparedStatement.setInt(1,id);
		
		preparedStatement.execute();
		System.out.println("deleted ");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
   public void Update(int id,String name)	  
   { 
	   Connection connection =Helperclass.getConnection();
	  
	   String sqlupdate= "UPDATE student SET name=? WHERE  id=?";
	   try {
			PreparedStatement preparedStatement=connection.prepareStatement(sqlupdate);
			preparedStatement.setString(1,name);
			preparedStatement.setInt(2, id);
			
			
			preparedStatement.execute();
			System.out.println("Updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	   
	   
   }
	   
		   
	   
	   
	   
   }
   public void readAll() 
   {
		 Connection connection=  Helperclass.getConnection();
		 String sqlAll= "SELECT * FROM student";
		try {
			PreparedStatement preparedStatement=  connection.prepareStatement(sqlAll);
			ResultSet resultset= preparedStatement.executeQuery(sqlAll);
			while(resultset.next()) {
				  System.out.println(resultset.getInt(1));
				  System.out.println(resultset.getString(2));
				  System.out.println(resultset.getString(3));
				  System.out.println("---------------------");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		 
	   }
   public void read(int id) {
	   Connection connection=  Helperclass.getConnection();
		 String sqlRead= "SELECT * FROM student WHERE ID=?";
		 try {
		PreparedStatement preparedStatement=	connection.prepareStatement(sqlRead);
	
		preparedStatement.setInt(1, id);
		ResultSet resultset=preparedStatement.executeQuery();
		while(resultset.next()) {
			 System.out.println(resultset.getInt(1));
			  System.out.println(resultset.getString(2));
			  System.out.println(resultset.getString(3));
			  System.out.println("---------------------");
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	   
   }
	


	

}
