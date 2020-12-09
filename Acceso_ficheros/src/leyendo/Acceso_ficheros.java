package leyendo;

import java.io.*;


public class Acceso_ficheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leer_fichero access=new Leer_fichero();
		
		access.lee();
	}

}

class Leer_fichero{
	
	public void lee(){
		
		try {
			FileReader entrada=new FileReader("src/fichero.txt");
			
			BufferedReader mibuffer=new BufferedReader(entrada);
			
			//int c=0;
			
			String linea="";
			
			while(linea!=null) {
				
				linea=mibuffer.readLine();
				
				if(linea!=null)
				System.out.println(linea);
				
			}

			entrada.close();
			
		}catch(IOException e) {
			System.out.print("No se ha encontrado el archivo"); 
			
		}
	}
		
}

