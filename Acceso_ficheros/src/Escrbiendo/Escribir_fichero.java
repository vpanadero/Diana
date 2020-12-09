package Escrbiendo;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Escribir_fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Escribiendo accede=new Escribiendo();
		
		accede.escribir();
	}

}

class Escribiendo{
	
	public void escribir() {
		
		String frase="Prueba de escritura";
		
		try {
			FileWriter escritura=new FileWriter("src/nuevo_texto.txt");
			for(int i=0; i<frase.length();i++) {
				escritura.write(frase.charAt(i));
											
			}
			JOptionPane.showMessageDialog(null, "Tu archivo ha sido creado"); 
			escritura.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.print("No se ha encontrado el directorio"); 
		}
	}
}