/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toba.transaction;

/**
 *
 * @author mturke
 */
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class TransactionServlet extends HttpServlet {
    
    
    @Override
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response)  
                          throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        try {
            out.println("");            
        }
        finally {
            out.close();
        }
    }
}
   
