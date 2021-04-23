package com.training.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyConServlet
 */
@WebServlet("/myConServlet")
public class MyConServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyConServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		
		//adding attribute
		ServletContext context = getServletContext();
		context.setAttribute("mess1 ","Have a good day");
		context.setAttribute("mess2 ","Welcome to Listeners");
		//replacing
		context.setAttribute("mess1","Hello world");
		//removing
		context.removeAttribute("mess2");
		
		
		
		
		
		
		
		String mailid =(String)context.getAttribute("newmail");
		out.print("Welcome "+request.getParameter("username")+"<br>");
		out.println("contact "+mailid);
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
