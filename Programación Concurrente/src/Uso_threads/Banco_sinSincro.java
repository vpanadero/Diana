package Uso_threads;

import java.util.concurrent.locks.*;

public class Banco_sinSincro {

	public static void main(String[] args) {
		
		Banco b=new Banco();
		
		for(int i=0;i<100;i++) {
			
			ejecuta_transferencia r=new ejecuta_transferencia(b,i,2000);	
		
			Thread t=new Thread(r);
		
			t.start();
		}
			
	}
}	

class Banco{
	
	
	public Banco() {
		
		cuentas=new double [100];
		
		saldoSuficiente=cierreBanco.newCondition();
		
		for(int i=0;i<cuentas.length;i++) {
			
			cuentas[i]=2000;
		}
	}



	
	public void transferencia(int origen, int destino, double cantidad) throws InterruptedException {
		
		cierreBanco.lock();
		
		try {
		
		while(cuentas[origen]<cantidad) {
			
			saldoSuficiente.await();			
			
		}
		
		System.out.println(Thread.currentThread());
		
		cuentas[origen]-=cantidad;
		
		System.out.printf("%10.2f de  %d para  %d ", cantidad, origen, destino);
		
		cuentas[destino]+=cantidad;
		
		System.out.printf("Saldo total; %10.2f%n ",saldotot());
		
		saldoSuficiente.signalAll();
		
		}finally {
			
			cierreBanco.unlock();	
		}
	}

public double saldotot() {
		
		double sumacuentas=0;
		
		for (double a:cuentas) {
			
			sumacuentas+=a;
		}
		return sumacuentas;
		
	}

	private final double[]cuentas;
	private Lock cierreBanco=new ReentrantLock();
	private Condition saldoSuficiente;
}

class ejecuta_transferencia implements Runnable{
	
	private Banco banco;
	private int delacuenta;
	private double cantmax;
	
	public ejecuta_transferencia(Banco b,int de,double max) {
		
		banco=b;
		delacuenta=de;
		cantmax=max;
		
	}
	
	
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true) {
			
				int paraLaCuenta=(int)(100*Math.random());	
				double cantidad=cantmax*Math.random();
				banco.transferencia(delacuenta, paraLaCuenta, cantidad);
				
					Thread.sleep(1500);
			}
		}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	
	}

}
