<%@page import="serverExample.CalculosMatematicos.Calculos"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

La suma de 5 y 7 es: <%= Calculos.metodoSuma(5, 7) %>

<br>

La resta de 10 y 5 es: <%=Calculos.metodoResta(10, 5) %>

</body>
</html>