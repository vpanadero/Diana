package graficos;

import java.awt.BorderLayout;

import javax.swing.*;

public class Disposiciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marcocaja micaja=new Marcocaja();
		
		micaja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class Marcocaja extends JFrame{
	
	public Marcocaja() {
		
		setVisible(true);
		
		setTitle("Marco en la caja");
			
		setBounds(600,350,200,200);
		
			
		JLabel rot1= new JLabel("Nombre");
		
		JTextField tex1=new JTextField(10);
		
		tex1.setMaximumSize(tex1.getPreferredSize());		
		
		Box cajah1=Box.createHorizontalBox();
		
		cajah1.add(rot1);
		cajah1.add(Box.createHorizontalStrut(10));
		cajah1.add(tex1);
		
		JLabel rot2= new JLabel("Contraseña");
		
		JPasswordField tex2=new JPasswordField(10);
		
		tex2.setMaximumSize(tex1.getPreferredSize());		
		
		Box cajah2=Box.createHorizontalBox();
		
		cajah2.add(rot2);
		cajah2.add(Box.createHorizontalStrut(10));
		cajah2.add(tex2);
		
		JButton boton1=new JButton("Ok"); JButton boton2=new JButton("Cancelar");
		
		Box cajah3=Box.createHorizontalBox();
		cajah3.add(boton1); 
		
		cajah3.add(Box.createGlue());
				
		cajah3.add(boton2);
		
		Box cajavertical=Box.createVerticalBox();
		
		cajavertical.add(cajah1); cajavertical.add(cajah2); cajavertical.add(cajah3);
		
		add(cajavertical, BorderLayout.CENTER);
		
		
		
	}
}  


	