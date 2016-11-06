<%-- 
    Document   : footer
    Created on : Oct 31, 2016, 9:40:37 PM
    Author     : mturke
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.GregorianCalendar, java.util.Calendar" %>
<%
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar.YEAR);
    %>
    <p>&copy; Copyright <%= currentYear %> TOBA Banking </p>
    </body>
</html>
