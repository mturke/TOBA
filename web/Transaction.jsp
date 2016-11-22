<%-- 
    Document   : Transaction
    Created on : Nov 2, 2016, 1:03:37 PM
    Author     : mturke
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Transactions</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
       
        <nav>
        <a href="index.jsp">HOME |</a> 
        <a href="Login.jsp">LOGIN |</a> 
        <a href="New_customer.jsp">NEW CUSTOMERS |</a> 
        <a href="Account_activity.jsp">ACCOUNT ACTIVITY |</a>
        <a href="Transaction.jsp">TRANSACTIONS</a> 
    </nav>
        
        <h1>Your balances: </h1>
        <h3>Checking Account: ${user.checkingBalance}</h3>
                
                <br>
                
        <h3>Savings Account : ${user.savingsBalance}</h3>
        
        <br>
      
        
        <h2>Select account to transfer from</h2>
        <form action="Account_activity.jsp" method="post">
            <p><label>From:</label>
            <select name = "From">
            <option value="select"> </option>
            <option value="CHECKING">Checking</option>
            <option value="SAVINGS">Savings</option>
                </select></p>

<br>

        <h2>Select account to transfer to</h2>

        <p><label>To:</label>
            <select name="To">
            <option value="select"> </option>    
            <option value="CHECKING">Checking</option>
            <option value="SAVINGS">Savings</option>                        
            </select></p>

<br>
        <p><label>Enter amount to transfer:</label><input type="number" name="Amount" placeholder="0" value="${transfer.amount}"></p>
            
<br>
        <input type="submit" value="submit">
        </form>

<br>
       
        <h1>Posted Transactions:</h1>
        
        <br>
        
        
        <br>
        
        
        
        <p>Go to your <a href="Account_activity.jsp">account activity</a></p>
        
               
        
        <br>
        <jsp:include page="footer.jsp" />

    </body>
</html>