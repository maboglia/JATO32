<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="model.Libro"%>
    <%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Libri</title>
</head>
<body>

    <h1>Libri</h1>
    
    <%@ include file="form_libro.jsp" %>
    
    
    
    
    <ul>
    
    <%ArrayList<Libro> libri = (ArrayList<Libro>)request.getAttribute("libri"); %>
        <% for(Libro l:libri){%>
            <li><%=l.getTitolo() %></li>
        <%} %>
    
    </ul>
    
</body>
</html>