package toba.newcustomer;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


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

        
        String message;
        HttpSession session = request.getSession();
        
        if (firstName == null || lastName == null || phone == null ||address == null || city == null || state == null || zipcode == null || email == null || 
            firstName.isEmpty() || lastName.isEmpty() || phone.isEmpty() || address.isEmpty() || city.isEmpty() || state.isEmpty() || zipcode.isEmpty() || email.isEmpty()) {
            message = "Please fill out all data fields.";
            response.sendRedirect("New_customer.jsp");    
        }

        else {
            User user = new User(firstName, lastName, phone, address, city, state, zipcode, email, userName, passWord);        
            session.setAttribute("user", user);
            message ="";
            url = "/Success.jsp";
        }
        request.setAttribute("message", message);

        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
    }
}

            
            
		
            
            
    
   

   
