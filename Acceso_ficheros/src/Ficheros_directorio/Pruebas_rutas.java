package Ficheros_directorio;

import java.io.*;

public class Pruebas_rutas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File archivo=new File("src");
		
		System.out.println(archivo.getAbsolutePath());
		System.out.println(archivo.exists());
		
	}

}
