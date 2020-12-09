package poo;

public class Pruebas_constantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Empleados trabajador1=new Empleados("Marta");		
		Empleados trabajador2=new Empleados("Carmen");
		Empleados trabajador3=new Empleados("Rebeca");
		Empleados trabajador4=new Empleados("Barbara");
						
		trabajador4.cambia_seccion("Redacci�n");
		
		System.out.println(trabajador1.dame_datos() + "\n" + trabajador2.dame_datos() + 
		"\n" + trabajador3.dame_datos() + "\n" + trabajador4.dame_datos());
		
		System.out.println(Empleados.dameidnext());
		
	}

}



class Empleados{
	
	private final String nombre; // aplicada constante FINAL para que nada cambia el valor a posteriori
	private String seccion;
	private int id;
	private static int idnext=1;
	

	
	public Empleados(String nom) {
		
		nombre=nom;
		
		seccion="Administraci�n";
		
		id=idnext;
		
		idnext++;
		
		
	}
	
	
	public void cambia_seccion(String seccion) {	//SETTER
		
		this.seccion=seccion;
		
		
	}
	
	
	public String dame_datos() {	//GETTER
		
		return "El nombre es: " + nombre + " y la secci�n es " + seccion + ", y su n�mero de empleado es " + id;
	}
	
	public static String dameidnext() {
		
		return "el id siguiente es " + idnext;
		
	}
	
}


