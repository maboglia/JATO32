<%@page import="controller.Libreria"%>
<%@page import="model.Libro"%>
<h1>Elenco dei libri disponibili</h1>

<table>
		<tr>
			<th>Titolo</th>
			<th>Pagine</th>
			<th>Prezzo</th>
			<th></th>
		</tr>

<% for( Libro l : Libreria.getMagazzino()  ){ %>
		<tr>
			<td><%= l.getTitolo() %></td>
			<td><%= l.getPagine() %></td>
			<td><%= l.getPrezzo() %></td>
			<td><a href="?page=viewLibro&id=<%= l.getId() %>">dettaglio</a></td>
		</tr>
<%	} %>
</table>
