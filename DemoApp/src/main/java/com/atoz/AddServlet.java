package com.atoz;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int k=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		System.out.print(k+j);
		PrintWriter out=res.getWriter();
		out.print(k+j+"Port"+req.getServerPort()+"Name"+req.getServerName());
		req.setAttribute("k", k+j+1);
		RequestDispatcher rd=req.getRequestDispatcher("sq");
		rd.include(req,res);
		
	}
}
