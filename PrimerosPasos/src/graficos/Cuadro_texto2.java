package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class Cuadro_texto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marcotxt1 marco3=new Marcotxt1();
		
		marco3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco3.setVisible(true);
		
		
		
	}

}


class Marcotxt1 extends JFrame{
	
	public Marcotxt1() {
			
		setBounds(500,300,450,300);
		laminatext1 lalamina1=new laminatext1();
		add(lalamina1);
	}
}

class laminatext1 extends JPanel{
	
	public laminatext1(){
		
		JLabel etiqueta=new JLabel("Introduce texto");
		
		JTextField campo=new JTextField(20);
		
		escuchatxt listener=new escuchatxt();
		
		Document midoc=campo.getDocument();
		midoc.addDocumentListener(listener);
		
		add(etiqueta);
		add(campo);
		
	}
	
	private class escuchatxt implements DocumentListener{

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Texto insertado");
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Texto borrado");
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Nuevos cambios");
		}
		
		
	}
}

