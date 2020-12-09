package Leer_escribir_bytes;

import java.io.*;

public class Lectura_escritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contador=0;
		
		int datos_entrada []= new int[5168];
		
		try {
			
			FileInputStream archivo_lectura=new FileInputStream("src/imagen.jpg");
			
			boolean final_ar=false;
			
			while(!final_ar) {
				
				int byte_entrada=archivo_lectura.read();
				if(byte_entrada!=-1)
				datos_entrada[contador]=byte_entrada;	
				else
					final_ar=true;
				System.out.println(datos_entrada[contador]);
				contador++;
			}
			
			archivo_lectura.close();
		}catch(IOException e) {
		
		System.out.println("El directorio no es correcto");	
		}
		
		System.out.println("El numero de byte es " + contador);
		
		crea_fichero(datos_entrada);
	}
	
	static void crea_fichero(int datos[]) {
		
		try {
			FileOutputStream fichero=new FileOutputStream("src/imagen_copia.jpg");
			
			for (int i=0;i<datos.length;i++) {
				
				fichero.write(datos[i]);
			}
			fichero.close();
			
		}catch(IOException e){
			
			System.out.println("El directorio no es correcto");	
			
		}
	}
}