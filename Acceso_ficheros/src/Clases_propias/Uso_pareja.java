package Clases_propias;

public class Uso_pareja {

	public static void main(String[] args) {
		
		Pareja<String> una=new Pareja<String>();
		
		una.setPrimero("Juan");
		
		System.out.println(una.getprimero());
		
		Persona per=new Persona("Ana");
		
		Pareja<Persona> otra=new Pareja<Persona>();
		
		otra.setPrimero(per);
		
		System.out.println(otra.getprimero());
		
	}

}


/////////////

class Persona{
	
	private String nombre;

	public Persona(String nombre) {
		
		this.nombre=nombre;
	}
	
	public String toString() {
		
		return "El nombre de este objeto es " + nombre;
	}
}