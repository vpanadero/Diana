import javax.swing.JOptionPane;

public class Fallos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


int matriz[]= {5,38,-15,92,71};

for(int elemento:matriz) {
	
	System.out.println("Posicion " +  elemento);	
	
		}

	String nombre=JOptionPane.showInputDialog("Introduce tu nombre");		
	
	int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
	
	System.out.println("Hola " + nombre + ". Tienes " + edad + " años. " + "El programa terminó su ejecución.");
	}

}

