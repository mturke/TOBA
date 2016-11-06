<%-- 
    Document   : New_customer
    Created on : Nov 2, 2016, 1:02:55 PM
    Author     : mturke
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>New Customer</title>
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
        
        <h1>Welcome to your new customer account set up</h1>
        
        <form action="New_customer" method ="post">
            <label>First Name:</label>
            <input type="text" name="firstName">
            <br>
            <label>Last Name:</label>
            <input type ="text" name="lastName">
            <br>
            <label>Phone:</label>
            <input type="text" name="phone">
            <br>
            <label>Address:</label>
            <input type ="text" name="address">
            <br>
            <label>City</label>
            <input type ="text" name="city">
            <br>
            <label>State</label>
            <input type ="text" name="state">
            <br>
            <label>Zipcode</label>
            <input type ="text" name="zipcode">
            <br>
            <label>Email</label>
            <input type ="text" name="email">
            <br>
           
            <br>
            <input type="submit" value="Submit">
        </form>
        
        
        
    <%@ page import="java.util.GregorianCalendar, java.util.Calendar" %>
<%
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar.YEAR);
    %>
    <p>&copy; Copyright <%= currentYear %> TOBA Banking </p>
    </body>
</html>
