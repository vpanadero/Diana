import java.util.Scanner;

public class Ejer_16 {

	public static void main(String[] args) {	
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		String pass="1234";
		
		boolean acierto=false;
						
		for(int i=0;i<3 && !acierto;i++) {
				
		System.out.println("Introduce la contraseņa");
				
		String respuesta=sc.nextLine();
		
			if(respuesta.equals(pass)) {
				
			System.out.println("Contraseņa Correcta");
			acierto=true;
			
			}else {
				System.out.println("Contraseņa Incorrecta, te quedan " + (2-i) + " intentos");
			}
		}
		System.out.println("Gracias");
	}
}