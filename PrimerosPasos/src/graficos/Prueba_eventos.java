package graficos;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Prueba_eventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marcobotones mimarco=new Marcobotones();
		
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class Marcobotones extends JFrame{
	
	public Marcobotones() {
		
		setTitle("Botones y eventos");
		
		setBounds(700,300,500,300);
		
		Laminabotones milamina= new Laminabotones();
		
		add(milamina);
		
	}
}

class Laminabotones extends JPanel implements ActionListener{
	
	JButton boton1=new JButton("Azul");
	
	JButton boton2=new JButton("Amarillo");
	
	JButton boton3=new JButton("Rojo");
	
	public Laminabotones() {
		
		add(boton1);	
		
		add(boton2);
		
		add(boton3);
		
		boton1.addActionListener(this);
		boton2.addActionListener(this);
		boton3.addActionListener(this);

		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		Object pulsado1=e.getSource();
		
		if(pulsado1==boton1) {
			
			setBackground(Color.blue);
			
		}
		
		else if (pulsado1==boton2) {
			
			setBackground(Color.yellow);
		}
		else {
			
			setBackground(Color.red);
		}
		
	}
	
}