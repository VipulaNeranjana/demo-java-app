package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class ViewAll {
	public static ArrayList<StudentDetails> viewAllSignings(){
		
		
		
		String url = "jdbc:mysql://localhost:3306/students";
		String user = "root";
		String password = "2273349@P";
		ArrayList<StudentDetails> tableDetails = new ArrayList<StudentDetails>();
		
		System.out.println("upper view all");
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			String oder3 = "SELECT * FROM studentdetails";
			String oder4 = "select count(*) from studentdetails;";
			
			Connection connection2 = DriverManager.getConnection(url, user, password);
			Statement statementForNew = connection2.createStatement();
			ResultSet result3 = statementForNew.executeQuery(oder3);
			
			Statement statementToCountRows = connection2.createStatement();
			ResultSet result4 = statementToCountRows.executeQuery(oder4);
			
			result4.next();
			int number = result4.getInt(1);
			System.out.println(number);
			
			
			while(result3.next()){

				String name = result3.getString("name");
				String email = result3.getString("email");
				String phone = result3.getString("phone");
				String userName = result3.getString("userName");
				String password1 = result3.getString("password");
				
				StudentDetails rowDetails = new StudentDetails(name,email,phone,userName,password1);
				tableDetails.add(rowDetails);

				}
			
			//System.out.println(tableDetails.get(0).getName());
			
		
				
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return(tableDetails);
		
		
		
	}
}
