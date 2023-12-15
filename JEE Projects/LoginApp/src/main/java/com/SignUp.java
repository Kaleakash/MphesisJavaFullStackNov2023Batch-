package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUp
 */
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	// create table login(emailid varchar(30) primary key,password varchar(30));
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		RequestDispatcher rd = request.getRequestDispatcher("SignUp.html");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb_phase2", "root", "root@123");
		PreparedStatement pstmt = con.prepareStatement("insert into login values(?,?)");
		pstmt.setString(1, emailid);
		pstmt.setString(2, password);
		int res = pstmt.executeUpdate();
		if(res>0) {
			pw.println("Account created successfully");
			rd.include(request, response);
		}
		} catch (Exception e) {
			pw.println("Account didn't create "+e.getMessage());
			rd.include(request, response);
		}
		response.setContentType("text/html");
	}

}
 