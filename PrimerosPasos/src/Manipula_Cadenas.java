
public class Manipula_Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre="Victor";
		
		int ultima_letra=nombre.length();		
		
		System.out.println("Hola me llamo " + nombre);
		
		System.out.println("Mi nombre tiene " + nombre.length() + " letras.");	
		
		System.out.println("La primera letra de " + nombre + " es la " + nombre.charAt(0) +
		" y la ultima letra es " + nombre.charAt(ultima_letra-1));
	}

}
