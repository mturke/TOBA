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
import toba.newcustomer.User;


public class LoginServlet extends HttpServlet {
    
    
    @Override protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response)  
                          throws ServletException, IOException {  
  
            
            String un=request.getParameter("Username");
            String pw=request.getParameter("Password");
		
            HttpSession session = request.getSession();
            User user = (User)session.getAttribute("user");
            String url = "";
            if (user == null)
                url = "/New_customer.jsp";
            else if(un.equals(user.getUserName()) && pw.equals(user.getPassWord()))
            {
		url = "/Account_activity.jsp";
            }
            else
            {
		url = "/Login_failure.jsp";
            }
            
            getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
    }
}
