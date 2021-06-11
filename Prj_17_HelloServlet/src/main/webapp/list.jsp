<%@page import="model.Todo"%>
<%@page import="java.util.ArrayList"%>
<ul>

<%
	ArrayList<Todo> todo = (ArrayList<Todo>) request.getAttribute("elenco");

	for(Todo t: todo){
		
		out.print("<li>");
		out.print(t);
		out.print("</li>");
		
	}

%>
</ul>