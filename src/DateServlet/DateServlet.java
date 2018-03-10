package DateServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DateServlet extends HttpServlet{
	
	private String message;

	public void init() throws ServletException{
		// 执行必需的初始化
	      message = "Hello World";
	}
	
	 public void doGet(HttpServletRequest request,HttpServletResponse response)
     throws ServletException, IOException{
		 response.setContentType("text/html");
		 PrintWriter out=response.getWriter();
		 out.println("<h1>"+message+"</h1>");
	 }


     public void destroy()
	 {
		  // 什么也不做
	 }
	
	public void service(HttpServletRequest req,HttpServletResponse resp)
	throws ServletException,IOException{
		Date date=new Date();
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("now "+date);
		out.close();
	}
}
