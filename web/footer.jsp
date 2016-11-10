<%-- 
    Document   : footer
    Created on : Oct 31, 2016, 9:40:37 PM
    Author     : mturke
--%>


<%@ page import="java.util.GregorianCalendar, java.util.Calendar" %>
<%
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar.YEAR);
    int currentDay = currentDate.get(Calendar.DATE);
    int currentMonth = currentDate.get(Calendar.MONTH) + 1;
    %>
    <p><%= currentMonth %>-<%= currentDay %>-<%= currentYear %> &copy; Copyright  TOBA Banking </p>
    </body>
</html>
