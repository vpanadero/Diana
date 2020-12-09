package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

public class Creando_marco_centrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCentrado Marco=new MarcoCentrado();
		
		Marco.setVisible(true);
		
		Marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
		
		
	}

}


class MarcoCentrado extends JFrame{
	
	public MarcoCentrado() {
		
		Toolkit mi_pantalla=Toolkit.getDefaultToolkit();
		
		Dimension screen=mi_pantalla.getScreenSize();
		
		int alto=screen.height;
		
		int ancho=screen.width;
		
		setSize(ancho/2, alto/2);
		
		setLocation(ancho/4, alto/4);
		
		setResizable(false);
		
		setTitle("Marco Centrado");
		
		Image Icono=mi_pantalla.getImage("src/graficos/icono.gif");
		
		setIconImage(Icono);
		
	}
	
}