package graficos;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Prueba_eventos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marcobotones mimarco=new Marcobotones();
		
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class Marcobotones2 extends JFrame{
	
	public Marcobotones2() {
		
		setTitle("Botones y eventos");
		
		setBounds(700,300,500,300);
		
		Laminabotones2 milamina= new Laminabotones2();
		
		add(milamina);
		
	}
}  

class Laminabotones2 extends JPanel{
	
	JButton boton1=new JButton("Azul");
	
	JButton boton2=new JButton("Amarillo");
	
	JButton boton3=new JButton("Rojo");
	
	public Laminabotones2() {
		
		add(boton1);	
		
		add(boton2);
		
		add(boton3);
		
		Fondo azul=new Fondo(Color.blue);
		
		Fondo amarillo=new Fondo(Color.yellow);
		
		Fondo rojo=new Fondo(Color.red);
		
		boton1.addActionListener(azul);
		boton2.addActionListener(amarillo);
		boton3.addActionListener(rojo);

		

	
	}
	
private	class Fondo implements ActionListener{
		
		private Color colordefondo;
		
		public Fondo(Color c) {
			
			colordefondo=c;
		}
		
		public void actionPerformed(ActionEvent e) {
			
			setBackground(colordefondo);
			
			
		}

	
	}


}