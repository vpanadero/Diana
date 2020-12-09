import javax.swing.*;
public class Uso_arrays_metodo_foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] paises= new String[8];
		
		/*paises[0]="España";
		paises[1]="México";
		paises[2]="Colombia";
		paises[3]="Perú";
		paises[4]="Argentina";
		paises[5]="Ecuador";
		paises[6]="Venezuela";
		paises[7]="Chile";
		
		/*for(int i=0;i<paises.length;i++) {
			
			System.out.println("Pais " + (i+1) + " " + paises[i]);
			
		}*/
		
		
		for(String elemento:paises) {
			
			System.out.println(elemento);
			
		}
	}

}
 