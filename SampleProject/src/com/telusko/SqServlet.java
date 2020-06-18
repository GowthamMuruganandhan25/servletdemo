package com.telusko;

	import java.io.PrintWriter;

	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import java.io.IOException;

	public class SqServlet extends HttpServlet{
		
		public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
		{
			int k=(int)req.getAttribute("k");
			
			k=k*k;
			
			
			PrintWriter out =res.getWriter();
			out.print(k);
			
			
		}
		
		

}
