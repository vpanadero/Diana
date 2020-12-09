package Ficheros_directorio;
import java.io.*;
public class Creando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File ruta=new File("/Volumes/Macintosh HD/Users/victor/eclipse-workspace/prueba_texto.txt");
		//ruta.mkdir();
		
		String destino=ruta.getAbsolutePath();
		try {
			ruta.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Escribiendo accede=new Escribiendo();
		
		accede.escribir(destino);
	}
	
	

}

class Escribiendo{
	
	public void escribir(String destino) {
		
		String frase="Esto es un ejemplo";
		
		try {
			FileWriter escritura =new FileWriter(destino);
			
			for(int i=0;i<frase.length();i++) {
				
				escritura.write(frase.charAt(i));
				
				
			}
			
			escritura.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}