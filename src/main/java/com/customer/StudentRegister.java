package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentRegister {
	public static String insertDetails(String name,String email,String phone,String userName,String password) {
		
		String url = "jdbc:mysql://localhost:3306/students";
		String user = "root";
		String passwordUser = "2273349@P";
		String output = "";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection2 = DriverManager.getConnection(url, user, passwordUser);
			Statement statement2 = connection2.createStatement();
			Statement statement3 = connection2.createStatement();
			
			String oder2 = "insert into students.studentdetails values(0,'"+name+"','"+email+"','"+phone+"','"+userName+"','"+password+"')";
			statement2.executeUpdate(oder2);
			
			String oder3 = "select * from studentdetails where userName='"+userName+"' and password='"+password+"'";
			ResultSet results2 = statement3.executeQuery(oder3);
			
			System.out.println(results2);
			
			if(results2.next()) {
				
				output = "Succsessfully added";
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return(output);
		
	} 

}
