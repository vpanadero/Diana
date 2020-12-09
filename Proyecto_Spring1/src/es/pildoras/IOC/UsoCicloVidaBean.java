package es.pildoras.IOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		Empleados Juan=contexto.getBean("miDirectorEmpleado",DirectorEmpleado.class);
		
		System.out.println(Juan.getInforme());
		
		
		

	}

}
