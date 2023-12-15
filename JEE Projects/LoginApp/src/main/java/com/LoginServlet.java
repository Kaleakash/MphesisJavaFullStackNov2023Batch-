package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter pw = response.getWriter();
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		RequestDispatcher rd1 = request.getRequestDispatcher("Home");
		RequestDispatcher rd2 = request.getRequestDispatcher("Login.html");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb_phase2", "root", "root@123");
		PreparedStatement pstmt = con.prepareStatement("select * from login where emailid = ? and password = ?");
		pstmt.setString(1, emailid);
		pstmt.setString(2, password);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			rd1.forward(request, response);
		}else {
			pw.println("EmailId or Password wrong, try once again!");
			rd2.include(request, response);
		}
		} catch (Exception e) {
			pw.println("Account didn't create "+e.getMessage());
			rd2.include(request, response);
		}
		response.setContentType("text/html");
	}
	

}
