package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Product;
import com.service.ProductService;

@Controller
public class ProductController {

	/*
	 * 
	 * create table product(pid int primary key auto_increment, pname varchar(50), price float, url blob);
	 * 
	 */
	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "storeProduct",method = RequestMethod.POST)
	public ModelAndView storeProduct(HttpServletRequest req, Product product) {
		String pname = req.getParameter("pname");
		float price = Float.parseFloat(req.getParameter("price"));
		String url = req.getParameter("url");
		
		product.setPname(pname);
		product.setPrice(price);
		product.setUrl(url);
		
		String result = productService.storeProduct(product);
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", result);
		mav.setViewName("products.jsp");
		
		return mav;
	}
}
