import java.util.Scanner;

public class Sueldo_maximo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int n, sueldo, sueldo_max=0;
		
		System.out.println("Introduce el numero de sueldos.....");
		
		n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			
			System.out.println("Introduce el sueldo.....");
			
			sueldo=sc.nextInt();
			
			if(sueldo>sueldo_max) 
				
				sueldo_max=sueldo;
		}
		
		System.out.println("El sueldo máximo de las " + n + " personas es: " + sueldo_max);
		
	}

}
