<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Usuarios Registrados</title>
</head>
<body>

<h2>Usuarios registrados</h2>

Usuario confirmado:<br/><br/>

Nombre: <%=request.getParameter("nombre") %> &nbsp; Apellido: <%=request.getParameter("apellido") %>
</body>
</html>