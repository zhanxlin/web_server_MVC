package web03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import POJO.MyPOJO;

public class MyServlet extends HttpServlet {
	public MyServlet() {
		super();
	}
	
	public void destory() {
		super.destroy();
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException{
		 response.setContentType("text/html");
		 PrintWriter out=response.getWriter();
		 out.println("<h1>"+"hello~~~"+"</h1>");
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException{
		boolean b=false;
		
		MyPOJO Mypojo=new MyPOJO();
		
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		
		b=Mypojo.login(id, password);
		if(b) {
			response.sendRedirect("LoginSuccessful.jsp");
		}
		else {
			response.sendRedirect("LoginFailed.jsp");
		}
		
	}
	
	public void init() throws ServletException{
		
	}
}

