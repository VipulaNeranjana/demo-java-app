package com.customer;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

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
			
			String change = MakeChanges.makeChanges(name, email, phone, userName, password, requrement);
			RequestDispatcher sendingDetails = request.getRequestDispatcher("login.jsp");
			sendingDetails.forward(request, response);
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
	}

}
