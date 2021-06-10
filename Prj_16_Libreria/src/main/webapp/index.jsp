<!-- header.jsp -->
<jsp:include page="header.jsp"></jsp:include>


<!-- menu.jsp -->
<%@ include file="menu.jsp" %>


<!-- switch per contenuto dinamico
	* home
	* add libro
	* list libri
	* view libro
	* lista acquisti
 -->
 
 <%  	
	 String pagina = "home";
	 
	 if (request.getParameter("page")!=null){
		 pagina = request.getParameter("page");
	 }
	 
	 switch(pagina){
	 	case "addLibro":
		%>
			<%@ include file="addLibro.jsp" %>
		<%
	 	break;
	 	case "listLibro":
		%>
			<%@ include file="listLibro.jsp" %>
		<%
	 	break;
	 	case "cart":
		%>
			<%@ include file="cart.jsp" %>
		<%
	 	break;
	 	case "home":
		%>
			<%@ include file="home.jsp" %>
		<%
	 	break;
	 	case "viewLibro":
			%>
			<%@ include file="viewLibro.jsp" %>
		<%	 		
	 	break;	
	 }
		 
 
 
 %>
 
 
 

<!-- footer.jsp -->
<%@ include file="footer.jsp" %>