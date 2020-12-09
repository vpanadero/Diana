package poo;


public class Coche {

	private byte ruedas;
	
	private int largo;
	
	private int ancho;
	
	private int peso_plataforma;
	
	private String color;
	
	private int peso_total;
	
	private double matriculacion=250;
	
	private boolean asientos_cuero, climatizador, metalizada;
	
	public Coche() {
		
		ruedas=4;
		
		largo=2000;
		
		ancho=300;
		
		peso_plataforma=500;
		
	}
	
	public String getgenerales() {   //MÉTODO GETTER cuando está encapsulado
		
		return "La plataforma del vehículo tiene " + ruedas + " ruedas. " +
		" Mide " + largo/1000 + " metros, con un ancho de " + ancho +
		" cm y un peso de plataforma de " + peso_plataforma + " kgs.";
		
		
	}
		
	
	public void setcolor(String color_coche) {	//MÉTODO SETTER con parámetro que se establece en el codigo principal
		
		color=color_coche;
	}
	
	public String dime_color() {   //MÉTODO GETTER DE COLOR
		
		return "El color del coche es " + color; 
	}
	
	public void conf_asientos(String asientos_cuero) {	//SETTER DE ASIENTOS
		
		if(asientos_cuero.equalsIgnoreCase("si")){
			
			this.asientos_cuero=true;
		}else 
			{
			this.asientos_cuero=false;
			
		}
	}
		
	public String dime_asientos() {		//GETTER DE ASIENTOS
			
		if(asientos_cuero==true) {
			
			return "El coche tiene asientos de cuero";
		}
		else {
			return "El coche tiene asientos de tela";
		}
	}
	
	public void config_clima(String climatizador) {  //SETTER DE CLIMA
		
			if(climatizador.equalsIgnoreCase("si")) {
				this.climatizador=true;
			}
			
			else{
				
				this.climatizador=false;
			}
			
		}
		
	public String dime_clima() {	//GETTER DE CLIMA
			
			if(climatizador==true) {
			
				return "El coche tiene climatizador";	
				
				}else {
					
					return "EL coche tiene aire acondicionado";
				}	
	}
			
	public void config_pintura(String metalizada) {  //SETTER DE PINTURA
				
				if(metalizada.equalsIgnoreCase("si")) {
					this.metalizada=true;
				}
				
				else{
					
					this.metalizada=false;
				}
				
			}
			
		public String dime_pintura() {	//GETTER DE PINTURA
				
				if(metalizada==true) {
				
					return "El coche tiene pintura metalizada";	
					
					}
				
				else {
						
						return "El coche tiene pintura sólida";
				}	
		}
	
	
		public String dime_pesotot() {	//SETTER + GETTER - ** NO SE DEBE USAR NUNC A**
		
		int peso_carro=500;
		
		peso_total=peso_plataforma+peso_carro;
		
		if(asientos_cuero==true) {
			
			peso_total=peso_total+50;
		}
		
		if(climatizador==true) {
			
			peso_total=peso_total+20;
			
		}
		
		return "El peso del coche es " + peso_total + " kgs."; 
 	}
	
	public double precio() {
		
		double precio_final=10000;
		
		if(asientos_cuero==true) {
			
			precio_final+=899.50;
		}
		
		if(climatizador==true) {
			
			precio_final+=349.99;
		}
		
		if(metalizada==true) {
			
			precio_final+=450.25;
		}
				
		return precio_final;
	}
	
	public double presupuesto() {
		
		return ((precio()*0.21)+precio()+matriculacion);
	}
}
