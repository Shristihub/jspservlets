package com.training.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("In servlet");
		String name = request.getParameter("username");
		String city = request.getParameter("city");
		String lan = request.getParameter("language");
		String mob = request.getParameter("mobile");
		Long mobile = Long.parseLong(mob);
		String [] hobbies = request.getParameterValues("hobby");
		
		request.setAttribute("uname", name);
		request.setAttribute("city", city);
		request.setAttribute("lan", lan);
		request.setAttribute("mobile", mobile);
		request.setAttribute("hobbies", hobbies);
		
		
		if(name.equals("admin")){
		RequestDispatcher dispatcher = 
			request.getRequestDispatcher("success.jsp");
		dispatcher.forward(request, response);
		}else{
			response.sendRedirect("index.jsp");
		}
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
