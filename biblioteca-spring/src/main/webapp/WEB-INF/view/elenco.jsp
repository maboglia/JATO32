<%@page import="java.util.List"%>
<%@page import="biblio.entities.Libro"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Libreria</h1>

<table id="elenco">
  <tr>
    <th>Titolo</th>
    <th>Prezzo</th>
  </tr>
  
	<!-- qui ciclare una lista di libri e mostrare una tabella html, ogni titolo sarà un link per accedere a dettaglio jsp -->
  <% for(Libro l : (List<Libro>)  request.getAttribute("libri")){ %>
  <tr>
    <td><a href="/mvc/libri/<%= l.getId() %>"><%= l.getTitolo() %></a></td>
    <td><%= l.getPrezzo() %></td>
  </tr>

<%} %>
</table>

</body>
</html>