<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Spiacente si è verificato un errore</h1>
<h2>La errorpage è perchè hai fatto una <%= exception.getMessage() %> </h2>
</body>
</html>