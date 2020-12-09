package Annotations;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {

	private CreacionInformeFinanciero InformeFinanciero;
	
	@Value("${email}")
	private String email;
	@Value("${nombreEmpresa")
	private String nombreEmpresa;
	

	
	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		
		this.InformeFinanciero = informeFinanciero;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestion y dirección de las operaciones financieras de las empresa";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return InformeFinanciero.getInformeFinanciero();
	}

}
