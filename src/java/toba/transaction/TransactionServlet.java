
package toba.transaction;


import java.io.*;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;
import toba.data.Account;
import toba.newcustomer.User;
import toba.data.AccountDB;

public class TransactionServlet extends HttpServlet {
    
    
    @Override
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response)  
                          throws ServletException, IOException {
        
        String url = "/Transaction.jsp";
        
        String From = request.getParameter("From");
        String To = request.getParameter("To");
        
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        
        String Amount = request.getParameter("Amount");
        
        Account source = AccountDB.selectAccount(user, From);
        source.debit(Double.parseDouble(Amount));
        
        Account destination = AccountDB.selectAccount(user, To);
        destination.credit(Double.parseDouble(Amount));
        
        AccountDB.update(source);
        AccountDB.update(destination);

       
        Transaction trans = new Transaction(source, destination, Double.parseDouble(Amount));

}
        ArrayList<Transaction>transactions = new ArrayList<>();
                
        //Create a TransactionDB
        //Insert Transaction in TransactionDB
        //loop thru list in account_activity
    }
    
    

   
