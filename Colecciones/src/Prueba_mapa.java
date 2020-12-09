import java.util.*;
public class Prueba_mapa {

	public static void main(String[] args) {
		
		HashMap<String, Empleado> personal=new HashMap<String, Empleado>();
		
		personal.put("01", new Empleado("Javier"));
		personal.put("14", new Empleado("Ana"));
		personal.put("09", new Empleado("Curro"));
		
		System.out.println(personal);
		
		personal.remove("09");
		
		System.out.println(personal);

	}

}


class Empleado{
	
	private String nombre;
	private double sueldo;
	
	public Empleado(String nombre) {
		
		this.nombre=nombre;
		sueldo=2000;
		
	}
	
	public String toString() {
		
		return " Nombre " + nombre + ", sueldo " + sueldo;
	}
}