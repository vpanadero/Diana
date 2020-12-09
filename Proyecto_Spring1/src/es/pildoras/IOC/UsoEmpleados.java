package es.pildoras.IOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		/* Empleado1=new JefeEmpleado();
		Empleados Empleado2=new SecretarioEmpleados();
		Empleados Empleado3=new DirectorEmpleado();
		
		//////////////////////
		
		System.out.println(Empleado2.getTareas());*/
		
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
				
		Empleados Juan=contexto.getBean("miEmpleado",Empleados.class);
		
		System.out.println(Juan.getTareas());
		
		SecretarioEmpleados Pedro=contexto.getBean("miSecretarioEmpledado",SecretarioEmpleados.class);
		
		System.out.println(Pedro.getEmail() + Pedro.getNombreEmpresa() + Pedro.getInforme() + Pedro.getTareas());		
		
		contexto.close();
	}

}
