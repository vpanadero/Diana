package Uso_threads;

public class Sincronizando_hilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		hilos_varios mihilo=new hilos_varios();
		hilos_varios2 mihilo2=new hilos_varios2(mihilo);
		
		
		mihilo.start();
				
		mihilo2.start();
		
			
		System.out.println("Tarea terminada");
			
	}

}

class hilos_varios extends Thread{
	
	public void run() {
		
		for (int i=0;i<15;i++) {
			
			System.out.println("Ejecutando hilo " + getName());
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
} 

class hilos_varios2 extends Thread{
	
	private Thread hilo;
	
	public hilos_varios2(Thread hilo) {
		this.hilo=hilo;
		
	}
	
	public void run() {
		
		try {
			hilo.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		for (int i=0;i<15;i++) {
			
			System.out.println("Ejecutando hilo " + getName());
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
} 