import java.util.*;

public class Adivina_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int aleatorio=(int)(Math.random()*100);
		
			
		Scanner entrada= new Scanner(System.in);
		
	
		int numero=0;
		
		
		
		while(numero!=aleatorio) {
			
			System.out.println("Introduce un nº");
			
			numero=entrada.nextInt();
			
			if(aleatorio<numero) {
				System.out.println("Más bajo");
				
			}
			else if(aleatorio>numero) {
				
				System.out.println("Más alto");
			}
	
		}
		
		System.out.println("Numero adivinado");
		
	}

}
