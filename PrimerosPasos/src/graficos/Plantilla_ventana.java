package graficos;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Plantilla_ventana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marcoprincipal mimarco1=new Marcoprincipal();
		
		mimarco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}


class Marcoprincipal extends JFrame{
	
	public Marcoprincipal() {
		
		setVisible(true);
		setTitle("Prueba Varios Oyentes");
			
		setBounds(1300,100,300,200);
		
		laminaprin milamina=new laminaprin();
		add(milamina);
				
	}
}  

class laminaprin extends JPanel{
	
	public laminaprin() {
		
		JButton boton1=new JButton("Nuevo");
		add(boton1);
		
		boton_cerrar=new JButton("Cerrar todo");
		
		add(boton_cerrar);
		
		Oyente1 oyentenuevo=new Oyente1();
		
		boton1.addActionListener(oyentenuevo);
	}
	
	private class Oyente1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Marco_popup marco=new Marco_popup();
			
			marco.setVisible(true);
		}
		
		
	}
	
	JButton boton_cerrar;
}
	
class Marco_emergente extends JFrame{
	
	public Marco_emergente(JButton boton_principal) {
		contador++;
		setTitle("Ventana " + contador);
		
		setBounds(40*contador,40*contador,300,150);
		cierra_todo oyente_cerrar=new cierra_todo();
		boton_principal.addActionListener(oyente_cerrar);
		
	}
	
	private class cierra_todo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub 
			dispose();
		}
		
		
	}
	
	private static int contador=0;
}