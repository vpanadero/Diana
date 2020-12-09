
public class Uso_arrays_metodo_foreach2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] aleatorios=new int[150];
		
		for (int i=0; i<aleatorios.length; i++) {
			
			aleatorios[i]=(int)Math.round(Math.random()*100);
		}
		
		for(int numeros:aleatorios) {
			
			System.out.print(numeros + " ");
		}
	}

}
