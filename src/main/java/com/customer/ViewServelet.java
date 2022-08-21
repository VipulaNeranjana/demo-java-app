package com.customer;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;


public class ViewServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("viewserverlet");
		
		try {
			
			ArrayList<StudentDetails> allSignings = ViewAll.viewAllSignings();
			request.setAttribute("allSignings", allSignings);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		RequestDispatcher sendingDetails = request.getRequestDispatcher("ViewSignings.jsp");
		sendingDetails.forward(request, response);
	}

}
