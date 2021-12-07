package com.demoApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		HttpSession session = req.getSession();
		
//		to remove session attribute
//		session.removeAttribute("sum");
//		if we remove attribute we can't use sum attribute

		int num = (int)session.getAttribute("sum");
		
		PrintWriter out = res.getWriter();
		out.println(num*num);
	}
}
