<%@page import="java.util.List"%>
<%@page import="biblio.entities.Libro"%>

<%@ include file="header.jsp" %>


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

<%@ include file="footer.jsp" %>
