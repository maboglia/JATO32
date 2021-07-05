<%@page import="java.time.LocalDateTime"%>
<%@page import="java.time.LocalDate"%>
<html>
<body>
<h2>Hello Maven!</h2>

<% LocalDateTime ld = LocalDateTime.now();

	out.print(ld);

%>


</body>
</html>
