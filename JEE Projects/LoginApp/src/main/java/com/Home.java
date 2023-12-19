package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Home
 */
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
		//Object obj	= request.getAttribute("user");
		HttpSession hs = request.getSession();
		Object obj  = hs.getAttribute("user");
		String emailid = (String)obj;
		pw.println("Welcome to Home page "+emailid);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		Object obj	= request.getAttribute("user");
		String emailid = (String)obj;
		pw.println("Welcome to Home page "+emailid);
		
		// 
		/*
		 * 
		 * 
		 * 	in home.jsp 
		Object obj	= request.getAttribute("user");
		String emailid = (String)obj;
		out.println("Welcome to Home page "+emailid);
		 */
	}

}
