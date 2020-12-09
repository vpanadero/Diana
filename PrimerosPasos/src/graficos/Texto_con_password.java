package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class Texto_con_password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ventana Window=new Ventana();
		
		Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Window.setVisible(true);
		
	}

}


class Ventana extends JFrame{
	
	public Ventana() {
	
		setBounds(900,300,400,250);
		setTitle("Campos requeridos");		

		Inside contenido=new Inside();
		
		add(contenido);
		
		
	}
	
	
}

class Inside extends JPanel{
	
	public Inside() {
	
	setLayout(new BorderLayout());	
	
	JPanel Upper=new JPanel();
	
	Upper.setLayout(new GridLayout(2,2));
	
	add(Upper, BorderLayout.NORTH);
	
	JLabel etiq1= new JLabel("Usuario");
	JLabel etiq2= new JLabel("Contraseña");
	
		
	JTextField field1=new JTextField(15);
	pass= new JPasswordField(15);
	
	Comprueba listener=new Comprueba();
	
	pass.getDocument().addDocumentListener(listener);
	
	Upper.add(etiq1);
	Upper.add(field1);
	Upper.add(etiq2);
	Upper.add(pass);
	
	JButton Validar=new JButton("Enviar");
	
	add(Validar, BorderLayout.SOUTH);
	
	}
	
	private class Comprueba implements DocumentListener{

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
		
			char [] contrasena;
			
			contrasena=pass.getPassword();
			
			if(contrasena.length<8 || contrasena.length>12) {
				
				pass.setBackground(Color.red);
			}else {
				
				pass.setBackground(Color.green);
			}
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
		
		
	}
	
	JPasswordField pass;
}