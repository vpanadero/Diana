import java.util.Scanner;

public class Ejer_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce el número de ventas");
		
		int ventas=sc.nextInt();
		
		int sumaVentas=0;
		
		for(int i=0;i<ventas;i++) {
			
			System.out.println("Introduce el precio de la venta " + (i+1));
			
			int precio=sc.nextInt();
			
			sumaVentas=sumaVentas+precio;
		}
		
		System.out.println("La suma del total de las ventas es " + sumaVentas);
		
		
	}

}
