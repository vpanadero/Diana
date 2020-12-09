import java.util.*;
public class Preuba_treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	TreeSet<String> ordenaPersonas=new TreeSet<String>();
	
		ordenaPersonas.add("Sandra");
	
		ordenaPersonas.add("Amanda");
	
		ordenaPersonas.add("Diana");
	
	for (String personas : ordenaPersonas) {
		
		System.out.println(personas);
		}
		

	
	Articulo primero=new Articulo(1, "Primer articulo");
	
	Articulo segundo=new Articulo(20, "Segundo articulo");
	
	Articulo tercero=new Articulo(3, "Tercer articulo");
	
	TreeSet<Articulo> ordename=new TreeSet<Articulo>();
	
		ordename.add(tercero);
		
		ordename.add(primero);
		
		ordename.add(segundo);
		
	for (Articulo articulos : ordename) {
		
		System.out.println(articulos.getdesc());
		
	}
	
	Articulo comparador=new Articulo();
	
	TreeSet<Articulo> ordena2=new TreeSet<Articulo>(comparador);
	
		ordena2.add(primero);
		
		ordena2.add(segundo);
		
		ordena2.add(tercero);
		
	for (Articulo articulo : ordena2) {
		
		System.out.println(articulo.getdesc());
		}
	}
}

class Articulo implements Comparable<Articulo>, Comparator<Articulo>{

	private int numeroArticulo;
	
	private String descripcion;
	
	public Articulo() {}
	
	public Articulo(int num, String desc) {
		
		numeroArticulo=num;
		
		descripcion=desc;
	}
	
	public String getdesc() {
		
		return descripcion;
	}
	
	@Override
	public int compareTo(Articulo o) {
		
		
		return numeroArticulo- o.numeroArticulo;
	}

	@Override
	public int compare(Articulo o1, Articulo o2) {
		
		String descA=o1.getdesc();
		
		String descB=o2.getdesc();
		
		return descA.compareTo(descB);
	}
	
	
}