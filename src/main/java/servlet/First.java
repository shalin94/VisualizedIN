package servlet;

import javax.servlet.*;
import java.io.IOException;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import java.io.*;


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
	out.println(api_key);
	out.println(secret);
	out.println(client_id);
	
		    }
}