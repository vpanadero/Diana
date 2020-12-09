package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marcotxt4 marco6=new Marcotxt4();
		
		marco6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco6.setVisible(true);
		
				
	}

}

class Marcotxt4 extends JFrame{
	
	public Marcotxt4() {
		
		setTitle("Desplegables");
		setBounds(500,300,550,400);
		laminaarea2 lalamina4=new laminaarea2();
		add(lalamina4);
	}
}

class laminaarea2 extends JPanel{
	
	public laminaarea2(){
	
		setLayout(new BorderLayout());
		texto=new JLabel("En un lugar de la mancha...");
		texto.setFont(new Font("Serif", Font.PLAIN, 16));
		add(texto, BorderLayout.CENTER);
		
		JPanel laminanorte=new JPanel();
		
		combo =new JComboBox();
		combo.addItem("Serif");
		combo.addItem("SansSerif");
		combo.addItem("Monospaced");
		combo.addItem("Dialog");
		
		escuchacombo evento=new escuchacombo();
		
		combo.addActionListener(evento);
		
		combo.setEditable(true);
		laminanorte.add(combo);
		
		add(laminanorte, BorderLayout.NORTH);
		
		
	}
	
	private class escuchacombo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			texto.setFont(new Font((String)combo.getSelectedItem(), Font.PLAIN, 18));
		}
		
		
	}
	
	private JLabel texto;
	private JComboBox combo;
}
	