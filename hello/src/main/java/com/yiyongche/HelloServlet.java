package com.yiyongche;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 @Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	    {
	        resp.setContentType("text/html");
	        resp.setStatus(HttpServletResponse.SC_OK);
	        resp.getWriter().println("<h1>Hello Servlet!!!!, My Name is Marcus Li.</h1>");
	        resp.getWriter().println("session=" + req.getSession(true).getId());
	    }
}
