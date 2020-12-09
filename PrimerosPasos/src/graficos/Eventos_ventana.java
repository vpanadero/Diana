package graficos;

import java.awt.event.*;
import javax.swing.*;

public class Eventos_ventana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marcoventana miventana=new Marcoventana();
		
		miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Marcoventana miventana2=new Marcoventana();
		
		miventana2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		miventana.setTitle("Ventana 1");
		
		miventana.setBounds(300, 300, 500, 350);
		
		miventana2.setTitle("Ventana 2");
		
		miventana2.setBounds(900, 300, 500, 350);

	}

}


class Marcoventana extends JFrame{
	
	public Marcoventana() {
		
		setVisible(true);
		
		//setTitle("Respondiendo");
		
		//setBounds(700,300,500,300);
		
		Mventana oyente=new Mventana();
		
		addWindowListener(oyente);
		
		
	}
}  

class Mventana extends WindowAdapter{
	
	public void windowActivated(WindowEvent e) {
		
		System.out.println("Ventana activada");
		
	}
	
	public void windowClosed(WindowEvent e) {
		
		System.out.println("Ventana Cerrada");
	}
	
			
	public void windowIconified(WindowEvent e) {
		
		System.out.println("Ventana minimizada");
		
	}
	
		
}