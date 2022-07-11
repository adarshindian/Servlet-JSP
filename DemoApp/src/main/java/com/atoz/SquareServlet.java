package com.atoz;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
	
	PrintWriter out=res.getWriter();
	out.print((int)req.getAttribute("k"));}
	
}
