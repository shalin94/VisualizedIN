package servlet;

import javax.servlet.*;
import java.io.IOException;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import java.io.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/First")
public class First extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
		    throws IOException, ServletException
		    {
    // get these from your FB Dev App
     String api_key =System.getenv("api_key");
    String secret = System.getenv("secret_key");
    String client_id = System.getenv("client_id");  


    response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	out.println("<html><body><h1>"+api_key+"</h1>");
	out.println("<h1>"+secret+"</h1>");
	out.println("<h1>"+client_id+"</h1></body></html>");
	
		    }
}