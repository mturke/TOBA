package toba.newcustomer;


import java.io.*;
import java.security.NoSuchAlgorithmException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import toba.data.Account;
import toba.data.AccountDB;
import toba.data.UserDB;

import toba.data.PasswordUtil;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Base64;
import toba.data.PasswordUtil;
import static toba.data.PasswordUtil.getSalt;
import static toba.data.PasswordUtil.hashPassword;

public class NewCustomerServlet extends HttpServlet{
    
    
    @Override
    protected void doPost(
            HttpServletRequest request, 
            HttpServletResponse response)  
            throws ServletException, IOException 
    { 
        String url = "/Success.jsp";
        
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zipcode = request.getParameter("zipcode");
        String email = request.getParameter("email");
        String userName = lastName + zipcode;
        String passWord = "welcome1";

        User user = new User();
        String message = "";
        HttpSession session = request.getSession();
        
        if (firstName == null || lastName == null || phone == null ||address == null || city == null || state == null || zipcode == null || email == null || 
            firstName.isEmpty() || lastName.isEmpty() || phone.isEmpty() || address.isEmpty() || city.isEmpty() || state.isEmpty() || zipcode.isEmpty() || email.isEmpty()) {
            message = "Please fill out all data fields.";
            response.sendRedirect("New_customer.jsp");    
        }

        else {
            user = new User(firstName, lastName, phone, address, city, state, zipcode, email);        
            UserDB.insert(user);

            Account checking = new Account("CHECKING", 0.00, user);
            Account savings = new Account("SAVINGS", 25.00, user);
        
            AccountDB.insert(checking);
            AccountDB.insert(savings);
         
        
            request.getSession().setAttribute("user", user);
            url = "/Success.jsp";
        }
                
        request.setAttribute("message", message);

        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
    }
    public static String getSalt(){
        Random r = new SecureRandom();
        byte[] saltBytes = new byte[32];
        r.nextBytes(saltBytes);
        return Base64.getEncoder().encodeToString(saltBytes);
    }
    
    public static String hashAndSaltPassword(String passWord)
            throws NoSuchAlgorithmException {
        String salt = getSalt();
       return hashPassword(passWord + salt);

    }
}

            
            
		
            
            
    
   

   
