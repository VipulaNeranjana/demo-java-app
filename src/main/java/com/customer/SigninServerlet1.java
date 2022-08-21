package com.customer;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SigninServerlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		//System.out.println(name);
		
		try {

			String newdetail = StudentRegister.insertDetails(name,email,phone,userName,password);
			request.setAttribute("newdetail", newdetail);
			
		}catch(Exception e) {

			e.printStackTrace();
		}
		
		RequestDispatcher sucessmessege = request.getRequestDispatcher("AddSuccess.jsp");
		sucessmessege.forward(request, response);
		
	}

}
