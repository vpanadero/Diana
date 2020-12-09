package Annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("Annotations")
@PropertySource("datosEmpresa.propiedades")
public class EmpleadosConfig {

	//definir el bean para informe financiero departamento compras
	
	@Bean
	public CreacionInformeFinanciero informeFinancieroDcompras() {
		
		return new InformeFinancieroDcompras();
	}
	
	//definir bean para director financiero e inyectar dependencias
	
	@Bean
	public Empleados directorFinanciero() {
		return new DirectorFinanciero(informeFinancieroDcompras());
	}
}
