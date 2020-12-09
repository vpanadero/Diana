package Conecta_BD;
import java.sql.*;
public class Conecta_ususarios {

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
			//3. EJECUTAR SQL
			ResultSet miResul=miState.executeQuery("SELECT * FROM productos");
			//4. RECORRER LA TABLA
			while(miResul.next()) {
				
				System.out.println(miResul.getString("NOMBREARTÍCULO" + " " + miResul.getString("PRECIO")));
			}
						
		}catch(Exception e){
			
			System.out.println("No Conecta");
			e.printStackTrace();
		}
		
	}

}
