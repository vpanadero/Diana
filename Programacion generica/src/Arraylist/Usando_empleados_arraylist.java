package Arraylist;

import java.util.*;
import java.io.*;

public class Usando_empleados_arraylist {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		
				
		/*Empleado[] personal=new Empleado[3];
		
		personal[0]=new Empleado("Antonio", 36, 40000);
		
		personal[1]=new Empleado("Ana", 31, 20008);
		
		personal[2]=new Empleado("Luis", 43, 22012);*/
		
		ArrayList <Empleado> personal=new ArrayList<Empleado>();
		
		
		personal.add(new Empleado("Antonio", 36, 40000));
		personal.add(new Empleado("Ana", 31, 20000));
		personal.add(new Empleado("Olga", 23, 12000));
		personal.add(new Empleado("Luis", 43, 25000));
			
		personal.set(1, new Empleado("Javier", 29, 19000));
		
		
		
			for(Empleado e:personal) {
				
				System.out.println(e.damedatos());
			}
				
	}

}

//-----------------------------------------------------------------------------------------------------------

class Empleado{ 

	public Empleado(String n, int ed, double sue){
		
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
