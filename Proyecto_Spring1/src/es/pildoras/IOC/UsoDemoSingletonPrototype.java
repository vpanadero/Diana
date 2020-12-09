package es.pildoras.IOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		
		// Carga XML de configuracion
		
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		// Petición de beans al contenedor
		
		SecretarioEmpleados Javier=contexto.getBean("miSecretarioEmpledado",SecretarioEmpleados.class);
		
		SecretarioEmpleados Marina=contexto.getBean("miSecretarioEmpledado",SecretarioEmpleados.class);
	
		System.out.println(Javier);
		
		System.out.println(Marina);
		
		if(Javier==Marina) System.out.println("Apuntan al mismo objeto");
		else System.out.println("NO apuntan al mismo objeto");
			
			
		}
	}
	


