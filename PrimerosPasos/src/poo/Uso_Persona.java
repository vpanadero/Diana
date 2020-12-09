package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Persona[] las_personas=new Persona[2];
		
		las_personas[0]=new empleado2("Luis Conde", 50000, 2020, 5, 1);
		las_personas[1]=new Alumno("Ana Lopez", "Informática");
		
		for (Persona p:las_personas) {
			
			System.out.println(p.dame_nombre() + " " + p.dame_descripcion());
		}
		
		
	}

}


abstract class Persona{
	
	private String nombre;
	
	public Persona(String nom){
		
		nombre=nom;
		
	}
	
	public String dame_nombre() {
		
		return nombre;
	}
	
	public abstract String dame_descripcion();
}



class empleado2 extends Persona{
	
	
	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int idnext=1;
	
	
	public empleado2 (String nom, double sue, int agno, int mes, int dia) {
		
		super(nom);
		
		sueldo=sue;

		id=idnext;
		
		idnext++;
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		
		altaContrato=calendario.getTime();
		
	}
	
	public String dame_descripcion() {
		
		return "Este empleado tiene un ID= " + id + " con un sueldo= " + sueldo;
		
	}

	public double dame_sueldo() { //GETTER SUELDO
		
		return sueldo;
	}
	
	public Date dame_fecha() {  //GETTER FECHA DE ALTA CONTRATO
		
		return altaContrato;
				
	}
	
	
	public void sube_sueldo(double porcentaje) { //SETTER DE AUMENTO SUELDO
		
		double aumento=sueldo*porcentaje/1000;
		
		sueldo+=aumento;
	}
	
		
}

class Alumno extends Persona{
	
	private String carrera;
	
	public Alumno(String nom, String car) {
		
		super(nom);
		
		carrera=car;
	}
	
public String dame_descripcion() {
		
		return "Este alumno está estudiando la carrera de " + carrera;
		
	}
}