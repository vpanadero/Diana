package Clases_propias;



public class Métodos_genericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String nombre[]= {"José", "María", "Pepe"};
		
		//String elementos=misMatrices.getmenor(nombre);
		
		//System.out.println(elementos);
		
		/*Empleados lista[]= {new Empleados("Ana",45,20000),
								new Empleados("Ana",45,20000),
								new Empleados("Ana",45,20000),
								new Empleados("Ana",45,20000)};
	
	
		System.out.println(misMatrices.getmenor(lista));*/

	}
}

class misMatrices{
	
	public static <T extends Comparable> T getmenor(T[]a) {
		
		if( a==null || a.length==0) {
			
			return null;
		}
			
			T emenor=a[0];
			for (i=1;i<a.length);i++){
				
				if(emenor.compareTo(a[i]>0){
					
					emenor=a[i];
				}
		}
	
	return emenor;
	}
}
