
public class Calculos_con_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double raiz=Math.sqrt(8);
		
		double base=5;
		
		double exponente=3;
		
		int resultado=(int) Math.pow(base, exponente);
				
		double operacion=raiz*(Math.PI);
		
		double res2=Math.round(operacion);
		
				
		
		System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + resultado);
		
		System.out.println("La raiz cuadrada de 8 es " + raiz + " pero si lo multiplicas por " + (Math.PI) + 
		" el resultado es " + res2);
		
		
			}

}
