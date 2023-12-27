package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Login;
import com.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@RequestMapping(value = "SignUp",method = RequestMethod.POST)
	public ModelAndView signUp(HttpServletRequest req, Login ll) {  // DI for HttpServletReqeust and Login 
		String emailid = req.getParameter("emailid");
		String password = req.getParameter("password");
		
		ll.setEmailid(emailid);
		ll.setPassword(password);
		
		ModelAndView mav = new ModelAndView();
		
		String result = loginService.signUp(ll);
		
		mav.addObject("msg", result);
		
		mav.setViewName("signUp.jsp");
		
		return mav;
	}
	
	@RequestMapping(value = "SignIn",method = RequestMethod.POST)
	public ModelAndView signIn(HttpServletRequest req, Login ll) {
		
			String emailid = req.getParameter("emailid");
			String password = req.getParameter("password");
			
			ll.setEmailid(emailid);
			ll.setPassword(password);
			
			ModelAndView mav = new ModelAndView();
			
			String result = loginService.signIn(ll);
			
			if(result.equalsIgnoreCase("success")) {
				mav.setViewName("Home.jsp");
			}else {
				mav.setViewName("failure.jsp");
			}
			
			return mav;
	}
}
