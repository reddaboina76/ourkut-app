package com.practices.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserServlet extends HttpServlet  {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String mobile = req.getParameter("UserName");
		System.out.println("Triggered by:" +req.getParameter("UserName"));
		MobileValidation mobval=new MobileValidation();
		boolean isValid= mobval.isValidMobile(mobile);
		System.out.println("Entered mobile number validation is : "+isValid );
		System.out.println("hello");
		System.out.println("Added changes!!");
		
	}

}
