package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class Texto_en_area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marcotxt2 marco4=new Marcotxt2();
		
		marco4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco4.setVisible(true);
		
		
		
	}

}


class Marcotxt2 extends JFrame{
	
	public Marcotxt2() {
		
		setTitle("Texto en área");
		setBounds(500,300,500,350);
		laminaarea lalamina2=new laminaarea();
		add(lalamina2);
	}
}

class laminaarea extends JPanel{
	
	public laminaarea(){
		
		miarea=new JTextArea(8,20);
		
		JScrollPane laminabarras=new JScrollPane(miarea);
		add(laminabarras);		
		JButton boton =new JButton("Dale");
		
		boton.addActionListener(new gestionarea());
		add(boton, BorderLayout.SOUTH);
	}
	
	private class gestionarea implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
	}
	JTextArea miarea;
}
		
		
	

