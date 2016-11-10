<%-- 
    Document   : Account_activity
    Created on : Nov 2, 2016, 12:19:59 PM
    Author     : mturke
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Account activity</title>
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
        
        <c:choose>
            <c:when test="${empty sessionScope.user}">
                <p>Welcome ${user.firstName}</p>
            </c:when>
            <c:otherwise>
                <p></p>
            </c:otherwise>
        </c:choose>
    
        <h1>Account Activity</h1>
        <br>
        <h2>Your account summary and activity: </h2>
        <br>
        <br>
        <br>
        <br>
        <br>
        

    <jsp:include page="footer.jsp" />

    </body>
</html>

