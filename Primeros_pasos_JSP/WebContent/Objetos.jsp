<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2> Objetos predefinidos JSP</h2>

Peticion de datos del navegador: <%= request.getHeader("User-Agent") %>

<br/><br/>

Petición idioma utilizado: <%= request.getLocale() %>

</body>
</html>