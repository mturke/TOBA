<%-- 
    Document   : Login
    Created on : Nov 2, 2016, 1:01:44 PM
    Author     : mturke
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TOBA Login</title>
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
        
        <br>
        
        <form action="login" method ="post">
            <label>Username:</label>
            <input type="text" name="Username"><br>
            <label>Password:</label>
            <input type ="text" name="Password">
            <input type="submit" value="Login">
        </form>
        <br>
        <h4>New customer? Login <a href="New_customer.jsp">here</a></h4>
        <h4>Reset <a href="password_reset.jsp">Password</a></h4>
             
    <%@ page import="java.util.GregorianCalendar, java.util.Calendar" %>
<%
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar.YEAR);
    %>
    <p>&copy; Copyright <%= currentYear %> TOBA Banking </p>
    </body>
</html>
