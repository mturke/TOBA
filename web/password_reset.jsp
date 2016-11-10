<%-- 
    Document   : password_reset
    Created on : Oct 31, 2016, 8:57:20 PM
    Author     : mturke
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Password Reset</title>
    </head>
    <body>
        
        <nav>
        <a href="index.jsp">HOME |</a> 
        <a href="Login.jsp">LOGIN |</a> 
        <a href="New_customer.jsp">NEW CUSTOMERS |</a> 
        <a href="Account_activity.jsp">ACCOUNT ACTIVITY |</a>
        <a href="Transaction.jsp">TRANSACTIONS</a> 
    </nav>
        <br>
        <h1>Reset your password:</h1>
        <br>
        
        <form action="Account_activity.jsp" method ="post">
            <label>New Password:</label>
            <input type ="text" name="New Password" value="${user.passWord}">
            <input type="submit" value="Login">
        </form>
        
            
            
                <br>

                
                
                
        <jsp:include page="footer.jsp" />
        
    </body>
</html>
