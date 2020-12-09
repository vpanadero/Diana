package es.pildoras.IOC;

public class JefeEmpleado implements Empleados {

	public String getTareas() {
			
		return "Gestiono las cuestiones relativas a mis empleados de secci�n";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Evaluo a los empleados y responde ante los mandos intermedios";
	}
	
	
	
}
