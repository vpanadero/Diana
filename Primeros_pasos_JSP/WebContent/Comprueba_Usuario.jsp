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
	
	String usuario=request.getParameter("usuario");
	
	String contra=request.getParameter("contra");
	
	Class.forName("com.mysql.jdbc.Driver");
	
		try{
	
	Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_jsp", "root", "");
	
	PreparedStatement c_preparada=miConexion.prepareStatement("SELECT * FROM usuarios WHERE USUARIO=? AND CONTRASENA=?");
	
	c_preparada.setString(1, usuario);
	
	c_preparada.setString(2, contra);
	
	ResultSet miResulset=c_preparada.executeQuery();
	
	if(miResulset.absolute(1)) out.println("Usuario autorizado");
	else out.println("No hay usuarios con esos datos");
		
	
	
		}catch(Exception e){
			
			out.println("Hubo un error");
			
		}
%>

</body>
</html>