package es.pildoras.IOC;

public class DirectorEmpleado implements Empleados {
	
	//creacion de campo (interfaz)
	
	private CreacionInformes informeNuevo;
	
	//creacion del constructor con par�metro
	
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		
		this.informeNuevo=informeNuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Dirijo a los mandos intermedios de la empresa";

	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "informe creado por el Director: " + informeNuevo.getInforme();
	}
	//metodo init ejecutar tareas antes de que el bean este disponible	
		
	public void metodoInicial() {
		
		System.out.println("Dentro del m�todo Init, van las tareas antes de ejecutar");
	}
		
	//metodo init ejecutar tareas antes de que el bean este disponible
	
	public void metodoFinal() {
		
		System.out.println("Dentro del m�todo Destroy, van las tareas despues de ejecutar");
	}
	
}
