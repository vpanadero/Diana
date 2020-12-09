import java.util.Scanner;

public class Ejer_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner entrada= new Scanner(System.in);
	
	System.out.println("Introduce un número");
	
	int numero=entrada.nextInt();

		if(numero/2==0) {
			
		int resultado= (numero/2);
		
		System.out.println("El resultado es divisible entre 2 y da:" + resultado);
		}else {
			
		System.out.println("El resultado no divisible entre 2");
		
		}
	} 

}
