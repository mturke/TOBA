
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>

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
        <br>
        <c:choose>
            <c:when test="${!empty sessionScope.user}">
                <p>Welcome, ${user.firstName}</p>
                <h1><u>Account Activity</u></h1>

                <br>
                
                <h2>Checking Account: ${user.checkingBalance}</h1>
                
                <br>
                
                <h2>Savings Account: ${user.savingsBalance}</h1>
                
                <br>
            </c:when>
            <c:otherwise>
                <p></p>
            </c:otherwise>
        </c:choose>
                <h1>Transactions:</h1>
                
                           
    <c:forEach var="transactions" items ="${transactions}">
               <td>${transactions.amt}</td>
    </c:forEach>
            
        <br>
       
        <br>        
        
        <br>

        <br>

        
        
        <br>
        <p>Go to your <a href="Transaction.jsp">transactions</a></p>              
        
        
        <br>
        
    <jsp:include page="footer.jsp" />

    </body>
</html>

