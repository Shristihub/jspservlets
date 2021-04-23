package com.training.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.bean.Address;
import com.training.bean.Employee;

/**
 * Servlet implementation class Login
 */
@WebServlet("/empServlet")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		String name = request.getParameter("empname");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String empId = request.getParameter("empId");
		int employId = Integer.parseInt(empId);
		String mob = request.getParameter("mobile");
		Long mobile = Long.parseLong(mob);
		
		Employee employee =new Employee();
		employee.setEmpname(name);
		employee.setEmpId(employId);
		employee.setMobile(mobile);
		
		Address address =new Address();
		address.setCity(city);
		address.setState(state);
		employee.setAddress(address);
		
		request.setAttribute("employee", employee);
		RequestDispatcher dispatcher = 
			request.getRequestDispatcher("empadd.jsp");
		dispatcher.forward(request, response);
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
