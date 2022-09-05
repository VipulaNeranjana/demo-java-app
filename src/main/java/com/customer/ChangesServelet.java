package com.customer;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ChangesServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String requrement = request.getParameter("requrement");
		
		try {
			if(requrement.equals("Change")) {
											
				String[] change = MakeChanges.makeChanges(name, email, phone, userName, password, requrement);
				String statement = "Successfully Updated!";
				request.setAttribute("statement", statement);
				
				List<Customer> customerdetail = CustomerDbUtil.validate(change[1], change[2]);
				request.setAttribute("customerdetail", customerdetail);

				RequestDispatcher sendingDetails = request.getRequestDispatcher("UserAccount.jsp");
				sendingDetails.forward(request, response);
			}
			else if(requrement.equals("Delete")) {
								 			
				String[] change = MakeChanges.makeChanges(name, email, phone, userName, password, requrement);
				String statement = "Successfully Deleted!";
				request.setAttribute("statement", statement);
				
//				List<Customer> customerdetail = CustomerDbUtil.validate(userName, password);
//				request.setAttribute("customerdetail", customerdetail);

				RequestDispatcher sendingDetails = request.getRequestDispatcher("login.jsp");
				sendingDetails.forward(request, response);
			}
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
	}

}
