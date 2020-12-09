package poo;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;

public class Prueba_temporizador{

	public static void main(String[] args) {
		
		DameLaHora Oyente=new DameLaHora();
		
		Timer mitemporizador=new Timer(5000, Oyente);
			
		mitemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para desaparecer");
		
		System.exit(0);

	}

}


class DameLaHora implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
		Date ahora=new Date();
		
		System.out.println("Te pongo la hora cada 5 sg: " + ahora);
		
		Toolkit.getDefaultToolkit().beep();
	}
	
}