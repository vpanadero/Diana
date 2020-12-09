package poo;

import java.util.*;

public class Uso_empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*empleado empleado1=new empleado("Juan Carlos", 16000, 2009, 1, 8);
		empleado empleado2=new empleado("Victor Ordoñez", 22000, 2014, 6, 2);
		empleado empleado3=new empleado("Susana Marco", 26000, 2000, 5, 8);
		
		
		empleado1.sube_sueldo(2);
		empleado2.sube_sueldo(5);
		empleado3.sube_sueldo(3);
		
		
		System.out.println("Nombre: " + empleado1.dame_nombre() + " Sueldo: " + empleado1.dame_sueldo()
		+ " Fecha de alta: " + empleado1.dame_fecha());
		
		System.out.println("Nombre: " + empleado2.dame_nombre() + " Sueldo: " + empleado2.dame_sueldo()
		+ " Fecha de alta: " + empleado2.dame_fecha());
		
		System.out.println("Nombre: " + empleado3.dame_nombre() + " Sueldo: " + empleado3.dame_sueldo()
		+ " Fecha de alta: " + empleado3.dame_fecha());*/
		
		
		Jefatura jefe_RRHH= new Jefatura("Patricia Marco", 20500, 1998, 02, 01);
		
		jefe_RRHH.establece_incentivo(500);
		
		
		Empleado[] mis_empleados=new Empleado[6];
		
		mis_empleados[0]=new Empleado("Juan Carlos", 16000, 2009, 1, 8);
		mis_empleados[1]=new Empleado("Victor Ordoñez", 22000, 2014, 6, 2);
		mis_empleados[2]=new Empleado("Susana Marco", 26000, 2000, 5, 8);
		mis_empleados[3]=new Empleado("Belén Solano");
		mis_empleados[4]=jefe_RRHH;
		mis_empleados[5]=new Jefatura("Silia Sanchez", 10000, 2011, 02, 14);
		Jefatura jefa_tlf=(Jefatura) mis_empleados[5];
				
		System.out.println(jefa_tlf.tomar_decisiones("Dar más días de vacaciones"));
		
		System.out.println(mis_empleados[3].dame_nombre() + " tiene un bonus de: " + mis_empleados[3].establece_bonus(180));
		
		for(Empleado e:mis_empleados) {
			
			e.sube_sueldo(1);
		
		}

		Arrays.sort(mis_empleados);	// ORDENA UN ARRAY DE MENOS A MÁS SEGUN LA INTERFAZ CompareTo
		
		for(Empleado e:mis_empleados) {
			
			System.out.println("Nombre: " + e.dame_nombre() + e.dame_id() + " Sueldo: " + e.dame_sueldo()
			+ " Fecha de alta: " + e.dame_fecha());
		}
		
	}

}




