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
	 	//addLibro.jsp	
	 	break;
	 	case "listLibro":
	 	//listLibro.jsp	
	 	break;
	 	case "cart":
	 	//cart.jsp	
	 	break;
	 	case "home":
	 	//home.jsp	
	 	break;
	 }
		 
 
 
 %>
 
 
 

<!-- footer.jsp -->
<%@ include file="footer.jsp" %>