package Annotations;
import javax.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") 
public class ComercialExperimentado implements Empleados {
	
	//ejecucion de codigo despues de creacion del bean
	
	@PostConstruct
	public void ejecutaDespuesCreacion(){
		
		System.out.println("Ejecutando tras creacion del bean");
	}
	
	//ejecucion de codigo despues de apagado del bean
	
	@PreDestroy
	public void ejecutaAntesDestruccion () {
		
		System.out.println("Ejecutando antes de la destruccion");
	}
	
	@Autowired
	@Qualifier("InformeFinancieroTrim2")
	private CreacionInformeFinanciero informetrim1;
	
	@Autowired
	public void setInformetrim1(CreacionInformeFinanciero informetrim1) {
		this.informetrim1 = informetrim1;
	}

	/*@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero informetrim1) {
		this.informetrim1 = informetrim1;
	}*/

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender todo tipo de articulos de una manera sobresaliente";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		//return "Esto es un informe generado por el Comercial Experimentado";
	
		return informetrim1.getInformeFinanciero();
	}
	

}
