<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	String nombre=request.getParameter("nombre");

	String apellido=request.getParameter("apellido");
	
	String usuario=request.getParameter("usuario");
	
	String contra=request.getParameter("contra");
	
	String pais=request.getParameter("pais");
	
	String tecno=request.getParameter("tecnologias");
	
	CLass.forName("com.mysql.jdbc.Driver");
	
		try{
	
	Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_jsp", "root", "");
	
	Statement miSocket=miConexion.createStatement();
	
	String instruccionSQL="INSERT INTO USUARIOS (Nombre, Apellido, Usuario, Contrasena, Pais, Tecnolog�a) VALUES ('" + nombre + "','" + apellido + "','" + usuario + "','" + contra + "','" + pais + "','" + tecno + "'));

	miSocket.executeUpdate(instruccionSQL);
	
	out.println("Registrado con �xito");
	
		}catch(Exception e){
			
			out.println("Hubo un error");
			
		}
%>

</body>
</html>