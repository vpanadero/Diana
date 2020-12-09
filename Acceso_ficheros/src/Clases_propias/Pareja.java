package Clases_propias;

public class Pareja<T> {

	private T primero;

	public Pareja() {
		
		primero=null;
	
	}
	public void setPrimero(T nuevo_valor) {
		
		primero=nuevo_valor;
	}

	public T getprimero() {
		return primero;
	}
}