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
			
			ArrayList<StudentDetails> allSignings = ViewAll.viewAllSignings(); //
			request.setAttribute("allSignings", allSignings);  //
			
			System.out.println(!customerdetail.isEmpty());
			
			if(submittedValue.equals("login")) {
				RequestDispatcher sendingDetails = request.getRequestDispatcher("UserAccount.jsp");
				sendingDetails.forward(request, response);
			}
			else if (submittedValue.equals("viewAll") && !customerdetail.isEmpty()) {
				RequestDispatcher sendingDetails = request.getRequestDispatcher("ViewSignings.jsp");//
				sendingDetails.forward(request, response);//
			}
			else if (submittedValue.equals("Make Changes")) {
				RequestDispatcher sendingDetails = request.getRequestDispatcher("MakeChanges.jsp");
				sendingDetails.forward(request, response);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
