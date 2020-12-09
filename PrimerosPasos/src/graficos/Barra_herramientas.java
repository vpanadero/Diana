package graficos;


import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class Barra_herramientas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_herramientas mimarco7=new Marco_herramientas();
			
			mimarco7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			mimarco7.setVisible(true);	
	}

}

class Marco_herramientas extends JFrame{
	
	public Marco_herramientas(){
		
		setTitle("Marco con Barra");
		
		setBounds(500,300,600,450);
		
		lamina=new JPanel();
		
		add(lamina);
		
		// configuraciÛn de acciones
		
		Action accionAzul=new AccionColor("Azul", Color.BLUE);
		
		Action accionAmarillo=new AccionColor("Amarillo", Color.YELLOW);
		
		Action accionRojo=new AccionColor("Rojo", Color.RED);
		
		JMenu menu=new JMenu("Color");
		
		menu.add(accionAzul);
		menu.add(accionAmarillo);
		menu.add(accionRojo);
		
		JMenuBar barmenu=new JMenuBar();
		
		barmenu.add(menu);
		
		setJMenuBar(barmenu);
		
		//CONSTRUCTOR DE LA BARRA DE HERRAMIENTAS
		
		JToolBar barra=new JToolBar();
		
		barra.add(accionAzul);
		barra.addSeparator();
		barra.add(accionAmarillo);
		barra.addSeparator();
		barra.add(accionRojo);
		
		add(barra, BorderLayout.WEST );
		
	}
		
	
	private class AccionColor extends AbstractAction{
		
		public AccionColor(String nombre, Color c){
			
			putValue(Action.NAME, nombre);
						
			putValue(Action.SHORT_DESCRIPTION, "Color de fondo..." + nombre);
			
			putValue("Color", c);
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			Color c=(Color) getValue("Color");
			
			lamina.setBackground(c);
			
		}		
		
	}
	private JPanel lamina;
}

