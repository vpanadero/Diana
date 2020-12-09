package Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//leeer el xml de config
		
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext_Annotations.xml");
		
		//pedir un bean al contenedor
		
		Empleados Antonio=contexto.getBean("ComercialExperimentado",Empleados.class);
		
		//usar el bean
		
		System.out.println(Antonio.getTareas() + " y además " + Antonio.getInformes());
		
		//cerrar el contexto
		
		contexto.close();

	}

}
