/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toba.newcustomer;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import toba.data.UserDB;

/**
 *
 * @author mturke
 */
@WebServlet(name = "PasswordResetServlet", urlPatterns = {"/PasswordResetServlet"})
public class PasswordResetServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
               
        String url = "/password_reset.jsp";
        String message = "";
        
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        
        if(user == null)
        {
            url = "/New_customer.jsp"; 
        }
             
        String passWord = request.getParameter("Password");
   
        if (passWord.isEmpty()){
        
            message = "Please reset your password";
            url = "/password_reset.jsp";   
        }
        else {
            user.setPassWord(passWord);
            url="/Account_activity.jsp";
        }
        
        UserDB userdb = new  UserDB();
        userdb.update(user);
        
        request.setAttribute("message", message);
        session.setAttribute("user", user);
        
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
    }
}
