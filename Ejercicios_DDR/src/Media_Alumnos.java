import java.util.Scanner;

public class Media_Alumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int n_alumno=1, edad=0, altura=0, suma_edad=0, media_mayor=0, media_altura=0, suma_altura=0, contador=0;
		
		////////////////////////////
		
		for(int i=0;i<5;i++) {
				
			System.out.println("Introduce la edad del alumno " + (n_alumno+i));
			
			edad=sc.nextInt();
			
			System.out.println("Introduce la altura del alumno " + (n_alumno+i));

			altura=sc.nextInt();
			
				if(edad>=18)  
					
					media_mayor++;				
				
				if (altura>=175)
						
					media_altura++; 
				
			
			System.out.println("El alumno " + (n_alumno+i) + " tiene " + edad + " años y mide " + altura + " cms");
			
			suma_edad=suma_edad+edad;
			
			suma_altura=suma_altura+altura;
			
			contador++;
		}
		
		System.out.println("La media de edad es de " + suma_edad/contador);
		System.out.println("La media de altura es de " + suma_altura/contador);
		System.out.println("Los mayores de 18 años son: " + media_mayor);
		System.out.println("Los más altos de 175 cm son: " + media_altura);
		
	}
	
}
