import java.util.*;

public class Entrada_Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
			
		System.out.println("Introduce tu nombre");
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introduce tu edad");
		
		int edad=entrada.nextInt();
		
		System.out.println("Introduce tu altura en cm");
		
		double talla=entrada.nextDouble();
		
		System.out.println("Introduce tu peso");
		
		float peso=entrada.nextFloat();
		
		
		
		System.out.println("Enhorabuena " + nombre_usuario + " de " + edad + " años. Tu " + talla + " metros y tus " + peso + " kilos son correctos");
		
		
	}

}
