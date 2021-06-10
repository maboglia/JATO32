<%@page import="controller.Libreria"%>
<% 

	String titolo = request.getParameter("titolo");
	int pagine = Integer.parseInt(request.getParameter("nPagine"));
	double prezzo = Double.parseDouble(request.getParameter("prezzo"));
	
	Libreria.addLibro(titolo, pagine, prezzo);
	
	response.sendRedirect("index.jsp?page=listLibro");


%>