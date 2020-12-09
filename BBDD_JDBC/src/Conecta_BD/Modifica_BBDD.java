package Conecta_BD;

import java.sql.*;


public class Modifica_BBDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String user="root";
		String pass="";
		String host=("jdbc:mysql://localhost:3306/curso");
		try {
			
			//1. CREACION DE CONEXION
			Connection miConexion=DriverManager.getConnection(host, user, pass);
			//2. CREACIONDE STATEMENT
			Statement miState=miConexion.createStatement();
			
			//String instruccionSQL="INSERT INTO PRODUCTOS (CÓDIGOARTÍCULO, NOMBREARTÍCULO, PRECIO) VALUES ('AR77', 'PANTALÓN', 25.35)";
			
			String instruccionSQL="UPDATE PRODUCTOS SET PRECIO=PRECIO*2 WHERE CÓDIGOARTÍCULO= 'AR77'";
			miState.executeQuery(instruccionSQL); 
			
			System.out.println("Datos actualizados correctamente");
			
		}catch(Exception e){
			
			System.out.println("No Conecta");
			e.printStackTrace();
		}
	}
}
		
	


