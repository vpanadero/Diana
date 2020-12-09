package Annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim3 implements CreacionInformeFinanciero {
	
	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentación de Informe Financiero Trimestre 3";
	}

}
