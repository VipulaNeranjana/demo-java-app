package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MakeChanges {
	
	public static String makeChanges(String name, String email, String phone, String userName, String password, String requrement) {
		
		String url = "jdbc:mysql://localhost:3306/students";
		String user = "root";
		String passWord = "2273349@P";
		String deleteOrder = "DELETE FROM studentdetails WHERE name='"+name+"';";
		String messege = null; 

		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection1 = DriverManager.getConnection(url, user, passWord);
			Statement statement1 = connection1.createStatement();
			
			if(requrement.equals("Delete")) {
				
				statement1.executeUpdate(deleteOrder);
				messege = "Your account is successfully deleted!";
			}
			else if(requrement.equals("Change")) {
				String getid = "select * from studentdetails where userName='"+userName+"';";
				ResultSet result1 = statement1.executeQuery(getid);
				result1.next();
				String changingOrder = "UPDATE studentdetails SET name = '"+name+"', email = '"+email+"', phone = '"+phone+"', userName = '"+userName+"', password = '"+password+"' WHERE id = "+result1.getInt(1)+";";
				statement1.executeUpdate(changingOrder);
				messege = "your accunt is successfully changed!";
				  
			}
			
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return messege;
		
	}

}
