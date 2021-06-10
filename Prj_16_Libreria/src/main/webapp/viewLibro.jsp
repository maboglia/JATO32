<%@page import="controller.Libreria"%>
<%@page import="model.Libro"%>
<h1>Dettaglio libro</h1>

<%

	int id = Integer.parseInt(  request.getParameter("id") );

	Libro l = Libreria.getLibroById(id);

%>

<h2><%= l.getTitolo() %></h2>
<p>Numero di pagine <%= l.getPagine() %></p>
<p>Prezzo di vendita <%= l.getPrezzo() %></p>

<p>Libro bellissimo,....</p>

<a href="">Acquista ora!</a>

