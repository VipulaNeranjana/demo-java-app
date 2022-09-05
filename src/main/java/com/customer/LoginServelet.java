package com.customer;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoginServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("password");
		String submittedValue = request.getParameter("submit");
	

		try {
			List<Customer> customerdetail = CustomerDbUtil.validate(userName, passWord);
			request.setAttribute("customerdetail", customerdetail);	
			
			
//			System.out.println(!customerdetail.isEmpty());
//			System.out.println(passWord.equals(""));
//			System.out.println(userName.equals(""));
			

			if(submittedValue.equals("login") && !customerdetail.isEmpty()) {
				RequestDispatcher sendingDetails = request.getRequestDispatcher("UserAccount.jsp");
				sendingDetails.forward(request, response);
			}
			else if (submittedValue.equals("viewAll") && !customerdetail.isEmpty()) {
				ArrayList<StudentDetails> allSignings = ViewAll.viewAllSignings(); 
				request.setAttribute("allSignings", allSignings);  

				RequestDispatcher sendingDetails = request.getRequestDispatcher("ViewSignings.jsp");//
				sendingDetails.forward(request, response);//
			}
			else if (submittedValue.equals("Make Changes") && !customerdetail.isEmpty()) {
				RequestDispatcher sendingDetails = request.getRequestDispatcher("MakeChanges.jsp");
				sendingDetails.forward(request, response);
			}
			else {
				String emptyMessage = "user name or password is incorrect!";
				request.setAttribute("emptyMessage", emptyMessage);
				
				RequestDispatcher sendingDetails = request.getRequestDispatcher("login.jsp");
				sendingDetails.forward(request, response);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
