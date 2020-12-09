<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<h1>

Ejemplo de Declaraciones

</h1>

<%!
	private int resultado;
	
	public int metodoSuma(int num1, int num2){
		
		resultado=num1+num2;
		
		return resultado;
	}
		
		public int metodoResta(int num1, int num2){
			
			resultado=num1-num2;
			
			return	resultado;
		}
		
		public int metodoMultiplica(int num1, int num2){
					
					resultado=num1*num2;
					
					return	resultado;
				}
%>

El resultado de la suma es: <%= metodoSuma(7,5) %>

<br>

El resultado de la resta es: <%= metodoResta(7,5) %>

<br>

El resultado de la multiplicación es: <%= metodoMultiplica(7,5) %>

</head>
<body>

</body>
</html>