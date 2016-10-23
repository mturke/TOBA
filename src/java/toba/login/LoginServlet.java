/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toba.login;

/**
 *
 * @author mturke
 */
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
    
    
    @Override protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response)  
                          throws ServletException, IOException {  
  
            String un=request.getParameter("Username");
            String pw=request.getParameter("Password");
		
            if(un.equals("jsmith@toba.com") && pw.equals("letmein"))
            {
		response.sendRedirect("Account_activity.html");
		return;
		
            }
            else
		
            {
		response.sendRedirect("Login_failure.html");
		return;
		}
   
    }
}
