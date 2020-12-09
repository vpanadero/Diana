import javax.swing.JOptionPane;

public class Ejerc_notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String Alumno=JOptionPane.showInputDialog("Introduce el nombre del alumno");
		
		Double Nota=Double.parseDouble(JOptionPane.showInputDialog("Introduce una nota del 0 al 10"));
		
		if(Nota<5) {
			
			System.out.println(Alumno + " ha obtenido una calificación de INSUFICIENTE");
		
		}else if(Nota==5) {
			
			System.out.println(Alumno + " ha obtenido una calificación de SUFICIENTE");
			
		}else if(Nota==6) {
			
			System.out.println(Alumno + " ha obtenido una calificación de BIEN");
			
		}else if(Nota==7 || Nota==8) {
			
			System.out.println(Alumno + " ha obtenido una calificación de NOTABLE");
			
		}else if (Nota==9 || Nota==10) {
			
			System.out.println(Alumno + " ha obtenido una calificación de SOBRESALIENTE");
			
		}else System.out.println("Error al introducir calificación");
	}

}
