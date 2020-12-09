package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marcotxt4 marco5=new Marcotxt4();
		
		marco5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco5.setVisible(true);
		
		
		
	}

}


class Marcotxt3 extends JFrame{
	
	public Marcotxt3() {
		
		setTitle("Verificación");
		setBounds(500,300,500,350);
		laminaarea2 lalamina3=new laminaarea2();
		add(lalamina3);
	}
}

class laminaarea1 extends JPanel{
	
	public laminaarea1(){
		
		setLayout(new BorderLayout());
		
		Font miletra=new Font("Serif", Font.PLAIN, 24);
		
		texto=new JLabel("En un lugar de la mancha de cuyo nombre...");
		texto.setFont(miletra);
		JPanel laminatextos =new JPanel();
		laminatextos.add(texto);
		add(laminatextos, BorderLayout.CENTER);
		
		check1=new JCheckBox("Negrita");
		check2=new JCheckBox("Cursiva");
		
		check1.addActionListener(new listenerbot());
		check2.addActionListener(new listenerbot());
		
		JPanel laminacheck=new JPanel();
		laminacheck.add(check1);
		laminacheck.add(check2);
		add(laminacheck, BorderLayout.SOUTH);
		
	}
	
	private class listenerbot implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int tipo=0;
			
			if(check1.isSelected()) tipo+=Font.BOLD;
			if(check2.isSelected()) tipo+=Font.ITALIC;
			texto.setFont(new Font("Serif", tipo, 24));
		}
		
		
	}
	
	private JLabel texto;
	private JCheckBox check1;
	private JCheckBox check2;
}
		
		
	

