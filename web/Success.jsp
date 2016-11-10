<%-- 
    Document   : Success
    Created on : Nov 2, 2016, 12:21:17 PM
    Author     : mturke
--%>
 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Success</title>
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
        
        <h1>Congrats! You've successfully set up your account</h1>
        <br>
        <h3>Your information:</h3>
        <br>
        <p>${user.firstName}</p>
        <p>${user.lastName}</p>
        <p>${user.phone}</p>
        <p>${user.address}</p>
        <p>${user.city}</p>
        <p>${user.state}</p>
        <p>${user.zipCode}</p>
        <p>${user.email}</p>
        <p>${user.userName}</p>
        <p>${user.passWord}</p>
        
        <br>
        <br>
        
        
        
        <br>
        
        <jsp:include page="footer.jsp" />

    </body>
</html>
