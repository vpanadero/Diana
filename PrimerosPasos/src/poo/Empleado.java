package poo;

import java.util.*;

public class Empleado implements Comparable, Trabajadores{ // Implementamos interfaz para poder ordenar
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int idnext=1;
	
	public Empleado (String nom, double sue, int agno, int mes, int dia) {
		
		nombre=nom;
		sueldo=sue;
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		
		altaContrato=calendario.getTime();
		
		id=idnext;
		
		idnext++;
		
	}
	
	public Empleado (String nom) {  //VALORES POR DEFECTO y solo nombre
		
		this(nom, 12000, 2020, 01, 01);
	}
	
	public String dame_nombre() { //GETTER NOMBRE
		
		return nombre;
	}
	

	public String dame_id() { //GETTER NOMBRE
		
		return " con Id " + id;
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

	public int compareTo(Object miObjeto) {
		
		Empleado otroEmpleado=(Empleado) miObjeto; // casting ya que el método necesita un int
		
		if(this.sueldo<otroEmpleado.sueldo) {
			
			return -1;
		}
		if(this.sueldo>otroEmpleado.sueldo) {
			
			return 1;
		}
		
		return 0;
	}
	
	public double establece_bonus(double gratificacion){
		
		return Trabajadores.bonus_base+gratificacion;
	}
}	
		
