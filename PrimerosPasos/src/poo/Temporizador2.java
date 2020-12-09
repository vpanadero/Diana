package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;


public class Temporizador2 {

	public static void main(String[] args) {
		
		Reloj mireloj=new Reloj();
		
		mireloj.enMarcha(3000, true);
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
		
		System.exit(0);

	}

}


class Reloj{
		
		
	public void enMarcha(int intervalo, final boolean sonido) {

		// CLASE INTERNA LOCAL SOLO VISIBLE Y EJECUTABLE DENTRO DEL MÉTODO
		
		class DameHora implements ActionListener{
			
			public void actionPerformed(ActionEvent evento) {
				
				Date ahora=new Date();
				
				System.out.println("Te pongo la hora cada 3 sg " + ahora);
				
				if(sonido==true) {
					
					Toolkit.getDefaultToolkit().beep();
				}
			}
			
			
		}
		
		ActionListener oyente=new DameHora();
		
		Timer mitemp=new Timer(intervalo, oyente);
		
		mitemp.start();
			
		
		}
	
	
	
}