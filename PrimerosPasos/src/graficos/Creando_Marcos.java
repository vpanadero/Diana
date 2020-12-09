package graficos;

import java.awt.Frame;

import javax.swing.*;

public class Creando_Marcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mimarco miventana= new mimarco();
		
		miventana.setVisible(true);
		
		miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class mimarco extends JFrame{
	
	public mimarco() {
		
		// setSize(500,300);
		
		// setLocation(1000,500);
		
		setTitle("Creando Marcos");
		
		setBounds(1000,500, 640, 360);
		
		//setResizable(false);
		

		//setExtendedState(Frame.MAXIMIZED_BOTH);
		
	}
}
	
	