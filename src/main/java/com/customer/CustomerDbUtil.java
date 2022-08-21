package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDbUtil {
	public static List<Customer> validate(String userName, String password ){
		
		ArrayList<Customer> customer1 = new ArrayList<>();
		
		// creating database connections
		
		String url = "jdbc:mysql://localhost:3306/students";
		String user = "root";
		String passwordUser = "2273349@P";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection1 = DriverManager.getConnection(url, user, passwordUser);
			Statement statement1 = connection1.createStatement();
			
			String oder = "select * from studentdetails where userName='"+userName+"' and password='"+password+"'";
			ResultSet results1 = statement1.executeQuery(oder);
			
			if(results1.next()) {
				int id1 = results1.getInt(1);
				String name1 = results1.getString(2);
				String email1 = results1.getString(3);
				String phoneNumber1 = results1.getNString(4);
				String userName1 = results1.getNString(5);
				String password1 = results1.getNString(6);
				
				Customer customerNew = new Customer(id1,name1,email1,phoneNumber1,userName1,password1);
				customer1.add(customerNew);
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		return customer1;
		
	}
}
