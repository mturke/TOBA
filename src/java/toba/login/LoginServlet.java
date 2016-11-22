
package toba.login;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import toba.data.UserDB;
import toba.newcustomer.User;


public class LoginServlet extends HttpServlet {
    
    
    @Override protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response)  
                          throws ServletException, IOException {  
  
            
            String un=request.getParameter("Username");
            String pw=request.getParameter("Password");
		
            User user = UserDB.get(un);
            
            String url = "";
            
            if (user == null)
                url = "/New_customer.jsp";
            else if(un.equals(user.getUserName()) && pw.equals(user.getPassWord()))
            {
		url = "/Account_activity.jsp";
                request.getSession().setAttribute("user", user);
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
