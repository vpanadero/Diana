package Clases_propias;

class Empleados {


	public Empleados(String n, int ed, double sue){
		
		nombre=n;
		edad=ed;
		sueldo=sue;
		
				
	}
	

	
	public String damedatos() {
		
		return ("El empleado se llama " + nombre + ". Tiene " + edad + " años." + " Y un salario de " + sueldo);
	}


	private String nombre;
	
	private double sueldo;
	
	private int edad;
	
}
