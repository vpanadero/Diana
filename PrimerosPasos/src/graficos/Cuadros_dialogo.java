package graficos;

import java.awt.event.*;

import javax.swing.*;


public class Cuadros_dialogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marcodialogo midialogo=new Marcodialogo();
		
		midialogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class Marcodialogo extends JFrame{
	
	public Marcodialogo() {
		
		setVisible(true);
		
		setTitle("Cuadros diálogo");
			
		setBounds(600,350,300,300);
		
		add(new Lamina_Cuadros_Dialogos());
	}
	
}

class Lamina_Cuadros_Dialogos extends JPanel{
	
	public Lamina_Cuadros_Dialogos(){
		
		 boton1=new JButton("boton 1");
		
		 boton2=new JButton("boton2");
		
		 boton3=new JButton("boton3");
		 
		 boton4=new JButton("boton4");
		
		boton1.addActionListener(new Accion_botones());
		boton2.addActionListener(new Accion_botones());
		boton3.addActionListener(new Accion_botones());
		boton4.addActionListener(new Accion_botones());
		
		add(boton1);
		
		add(boton2);
		
		add(boton3);
		
		add(boton4);
		
	}
	
	private class Accion_botones implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(e.getSource()==boton1){
				
				//JOptionPane.showMessageDialog(Lamina_Cuadros_Dialogos.this, "Mensaje de prueba");
				JOptionPane.showMessageDialog(Lamina_Cuadros_Dialogos.this, "Mensaje de prueba", "Atencion", 2);
				
				
				
				
				
				
			}else if(e.getSource()==boton2){
				
				JOptionPane.showInputDialog(Lamina_Cuadros_Dialogos.this, "Introduce nombre", "Formulario", 1);
				
				
				
				
				
			}else if(e.getSource()==boton3){
				
				
				JOptionPane.showConfirmDialog(Lamina_Cuadros_Dialogos.this, "Elige opción", "Seleccion", 2);
				
				
				
			}else{
				
				JOptionPane.showOptionDialog(Lamina_Cuadros_Dialogos.this, "Escoge opcion", "Advertencia", 1, 1, null, null, null);
				
				
				
				
				
			}
			
		}		
		
	}
	
	private JButton boton1, boton2, boton3, boton4;
}
