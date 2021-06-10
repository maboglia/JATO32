<% 
if (request.getParameter("username") != null && request.getParameter("password") != null) {
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	
	if (username.equals("Pippo") && password.equals("12345")) {
		out.print("Log in has been successful");
		response.sendRedirect("areariservata.jsp");
	}else {
		out.print("Username or password error");
	}
}else {
	response.sendRedirect("login.jsp");
}







%>