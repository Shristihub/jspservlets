package com.training.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.model.BookDetails;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/bookServlet")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BookServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		String category = request.getParameter("category");
		String type = request.getParameter("usertype");
		BookDetails details = new BookDetails();
		List<String> bookList = details.findBookByCategory(category);
		PrintWriter out = response.getWriter();
		// get the existing session
		HttpSession session = request.getSession(false);
		if (session != null) {
			out.print(type);
			out.print("in servlet " + session.getAttribute("username")+"<br>");
			out.print("Session Id in BookServlet Page "+session.getId()+"<br>");
			request.setAttribute("bookList", bookList);
			RequestDispatcher dispatcher = request.getRequestDispatcher("final.jsp");
			dispatcher.include(request, response);
		} else {
			response.sendRedirect("index.jsp");
		}
	

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
