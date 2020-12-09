package Annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
	
		
	//leeer el xml de config
		
	
		
	//ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext_Annotations.xml");
	
	//leer el class de config	
	
	AnnotationConfigApplicationContext contexto=new AnnotationConfigApplicationContext();
	
	//pedir un bean al contenedor
				
	Empleados Antonio=contexto.getBean("DirectorFinanciero",Empleados.class);
	
	Empleados Lorena=contexto.getBean("ComercialExperimentado",Empleados.class);
	
	System.out.println(Antonio.getTareas() + " y además " + Antonio.getInformes());
	
	//cerrar el contexto
	
	contexto.close();
	}

}
