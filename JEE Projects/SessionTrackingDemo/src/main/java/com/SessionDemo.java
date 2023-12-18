package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionDemo
 */
@WebServlet("/SessionDemo")	// url pattern 
public class SessionDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionDemo() {
        super();
        // TODO Auto-generated constructor stub
    }
    int count;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		HttpSession hs  = request.getSession();
		if(hs.isNew()) {
			pw.println("<br/> New Client");
		}else {
			pw.println("<br/> Old Client");
		}
		pw.println("<br/> Session Id "+hs.getId());
		pw.println("<br/> Session creation time in milllisecond format "+hs.getCreationTime());
		pw.println("<br/> Session creation time in date and time format "+new Date(hs.getCreationTime()));
		pw.println("<br/> Last Access time "+new Date(hs.getLastAccessedTime()));
		pw.println("<br/> Default session time "+hs.getMaxInactiveInterval());
		hs.setMaxInactiveInterval(600);
		pw.println("<br/> Set session time "+hs.getMaxInactiveInterval());
		pw.println("<br/> count value is "+count);
		if(count%5==0) {
			hs.invalidate();			
		}
		pw.println("<br/>");
		count++;
		RequestDispatcher rd = request.getRequestDispatcher("index.html");
		rd.include(request, response);
		response.setContentType("text/html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
