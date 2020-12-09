import java.util.Scanner;

public class Uso_tallas {
	
	enum Talla{
		
				
		MINI("34"), MEDIANO("36"), GRANDE("38"), ENORME("40");
		
		private Talla (String abreviatura) {
			this.abreviatura=abreviatura;
		}
		
		private String abreviatura;
		
		public String Dame_talla() {
			
			return abreviatura;
		}
		
	}
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Escribe tu talla: MINI, MEDIANO, GRANDE, ENORME");
		
		String entrada_datos=entrada.next().toUpperCase();
		
		Talla la_talla=Enum.valueOf(Talla.class, entrada_datos);
		
		System.out.println("Talla=" + la_talla);
		
		System.out.println("Abreviatura=" + la_talla.Dame_talla());

	}

}