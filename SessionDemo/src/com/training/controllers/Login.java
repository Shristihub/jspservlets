package com.training.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out  = response.getWriter();
		response.setContentType("text/html");
		String [] names={"Ram","Tom","John","Joseph","Zeena"};
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String user = request.getParameter("usertype");
		boolean flag = false;
		for (String name : names) {
			if(name.equals(username)&& password.equals("admin123")){
				flag=true;
			}
		}
		if(flag){
			HttpSession session = request.getSession();
			session.setAttribute("username",username);
			request.setAttribute("usertype",user);
			out.print("Session Id in servlet "+session.getId());
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("success.jsp");
			dispatcher.include(request, response);
	
		}else{
			response.sendRedirect("index.jsp");
		}
		
		
		
		
		
	}

}
