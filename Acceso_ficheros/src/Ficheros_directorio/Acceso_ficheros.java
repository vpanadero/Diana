package Ficheros_directorio;
import java.io.*;
public class Acceso_ficheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File ruta=new File("/Volumes/Macintosh HD/Users/victor/eclipse-workspace");
		
		System.out.println(ruta.getAbsolutePath());
		
		String[] nombres=ruta.list();
		
		for(String e:nombres) {
			
			System.out.println(e);
			
			File f=new File(ruta.getAbsolutePath(), e);
			
			if(f.isDirectory()){
				
				String[] sub=f.list();
				
				for(String r:sub) {
					
					System.out.println(r);
				}
			}
		}
	}

}
