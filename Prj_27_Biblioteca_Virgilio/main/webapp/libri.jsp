
<!DOCTYPE html>
<%@page import="java.util.Set"%>
<%@page import="java.util.List"%>
<html>
<head>
<meta charset="utf-8">
<title>Libri</title>
</head>
<body>


<h1>Libri</h1>

<table>
<tr><th>titolo</th></tr>
<% Set<String> libri = (Set<String>)request.getAttribute("libri"); %>
<% for(String libro : libri){ %>
	<tr><td><%=libro %></td></tr>
<%} %>

</table>

</body>
</html>