package Conecta_BD;

import java.sql.*;


public class Consulta_preparada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String user="root";
		String pass="";
		String host=("jdbc:mysql://localhost:3306/curso");
		try {
			
			//1. CREACION DE CONEXION
			Connection miConexion=DriverManager.getConnection(host, user, pass);
			//2. PREPARAR CONSULTA
			String instruccionSql="SELECT NOMBREARTÍCULO, SECCIÓN, PAÍSDEORIGEN FROM PRODUCTOS" 
			+ " WHERE SECCIÓN=? AND PAÍSDEORIGEN=?";
			
			PreparedStatement consulta=miConexion.prepareStatement(instruccionSql); 
	
			//3. ESTABLECER PARAMETROS DE CONSULTA
			
			consulta.setString(1, "DEPORTES");
			consulta.setString(2, "USA");
			
			//4. EJECUTAR Y RECORRER CONSULTA
			
			ResultSet rs= consulta.executeQuery();
			
			while(rs.next()) {
				
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			rs.close();
		}catch(Exception e){
		
		System.out.println("No Conecta");
		e.printStackTrace();
		}
		
	}
}

