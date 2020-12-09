package poo;


public class Uso_vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Coche micoche1=new Coche();
		
		micoche1.setcolor("Rojo");
		
		Furgoneta mifurgo1=new Furgoneta(7, 580);
		
		mifurgo1.setcolor("Azul");
		
		mifurgo1.conf_asientos("Si");
		
		mifurgo1.config_clima("Si");
		
		
		System.out.println(mifurgo1.getgenerales() + "\n" + mifurgo1.dime_color() + "\n" + mifurgo1.dime_datos_furgo());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	
	Coche micoche= new Coche();
	
		
	micoche.setcolor(JOptionPane.showInputDialog("Introduce color"));
	System.out.println(micoche.dime_color());
	
	micoche.conf_asientos(JOptionPane.showInputDialog("Asientos de cuero: SI/NO"));
	System.out.println(micoche.dime_asientos());
	
	micoche.config_clima(JOptionPane.showInputDialog("Climatizador: SI/NO"));
	System.out.println(micoche.dime_clima());
	
	micoche.config_pintura(JOptionPane.showInputDialog("Pintura metalizada: SI/NO"));
	System.out.println(micoche.dime_pintura());
	
	
	System.out.println("El precio total del coches es " + micoche.precio() + " sin iva.");
	System.out.print("El valor total con matriculacion e impuestos es ");
	System.out.printf("%1.2f", micoche.presupuesto());
	
	
	System.out.println(micoche.dime_pesotot());
	System.out.println(micoche.getgenerales());
	
	
		
		Coche Renault=new Coche(); //INSTANCIAR CLASE O EJEMPLAR DE CLASE
	
		System.out.println("Este coche mide " + Renault.getmedida()+ " cms.");
	*/
	
	}

}
 