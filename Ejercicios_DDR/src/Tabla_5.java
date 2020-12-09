import java.util.Scanner;

public class Tabla_5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
				
		int t[]=new int [5];
		
		for(int i=0;i<5;i++) {
			
			System.out.println("Introduce un número...");
			
			t[i]=sc.nextInt();
			
		}
		for (int suma:t)
			
		System.out.println(suma);
	}

}
