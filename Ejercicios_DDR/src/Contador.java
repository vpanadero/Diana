import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int aleatorio=(int) ((Math.random()*100));
		
		System.out.println("Introduce un n�mero");
		
		int contador=0;
		
		int dato=0;
			
		while(dato!=aleatorio) {
			
			dato=sc.nextInt();
			
			contador++;
			
			if(dato>aleatorio) {
				
				System.out.println("N�mero m�s bajo");
				
			}else if(dato<aleatorio) {
				
				System.out.println("N�mero m�s alto");
				
			}
		}
		
		System.out.println("Enhorabuena el numero era " + aleatorio + " y lo has conseguido en " + contador + " intentos");
	}

}
