package com.pms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pms.entity.Product;
import com.pms.service.ProductService;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();				// object created. 
		
		// receive the value from form 
		
		String pname = request.getParameter("pname");
		float price = Float.parseFloat(request.getParameter("price"));
		String url = request.getParameter("url");
		
		// convert those value to objects. 
		
		Product p = new Product();
		p.setPname(pname);
		p.setPrice(price);
		p.setUrl(url);
		
		// created service class object. 
		ProductService ps = new ProductService();
		String result = ps.storeProduct(p);
		pw.print(result);
		RequestDispatcher rd = request.getRequestDispatcher("addProduct.jsp");
		rd.include(request, response);
		response.setContentType("text/html");
		
		
	}

}
