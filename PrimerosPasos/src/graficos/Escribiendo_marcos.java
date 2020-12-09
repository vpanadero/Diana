package graficos;

import javax.swing.*;
import java.awt.*;

public class Escribiendo_marcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Marcotxt mimarco=new Marcotxt();
	
	mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
		
	}

}



class Marcotxt extends JFrame{
	
	public Marcotxt() {
		
		setVisible(true);
		
		setBounds(800,400,1000,600);
		
		setTitle("Primer Texto");
		
		lamina milamina=new lamina();
		
		add(milamina);
	}
}

class lamina extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawString("Estamos aprendiendo Swing", 100, 100);
	}
}