package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Cuadro_texto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marcotxt marco=new Marcotxt();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);
		
		
		
	}

}


class Marcotxt extends JFrame{
	
	public Marcotxt() {
		
				
		setBounds(500,300,450,300);
		
		laminatext lalamina=new laminatext();
		add(lalamina);
	}
}

class laminatext extends JPanel{
	
	public laminatext(){
		resultado=new JLabel();
		JLabel txt1=new JLabel("Email ");
		add(txt1);
		campo1=new JTextField(20);
		add(campo1);
		add(resultado);
		JButton miboton=new JButton("Validar");
		Dametxt mievento=new Dametxt();
		miboton.addActionListener(mievento);
		add(miboton);
	}
	
	private class Dametxt implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int correcto=0;
			String email=campo1.getText().trim();
			for(int i=0;i<email.length();i++) {
				
				if(email.charAt(i)==’@’){
					
					correcto++;
				}
			}
			if(correcto!=1) {
				
				resultado.setText("Incorrecto");
			}
			else {
				resultado.setText("Correcto");
				
			}
			
			System.out.println(campo1.getText().trim());
		}
		
		
	}
	JTextField campo1;
	private JLabel resultado;
}

