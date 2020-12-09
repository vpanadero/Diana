package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;
import java.util.Date;

public class Ejercicio_practico_completo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		marcoption opcion=new marcoption();
		
		opcion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		opcion.setVisible(true);
		
		
		
	}

}


class marcoption extends JFrame{
	
	private lamina_botones lamina_tipo, lamina_mensajes, lamina_mensaje, lamina_confirmar, lamina_opcion, lamina_entrada;
	
		public marcoption() {
		
		setBounds(500,300,600,450);
		setTitle("Prueba de diálogos");
		setResizable(true);
		JPanel lamina_cuadricula=new JPanel();
		lamina_cuadricula.setLayout(new GridLayout(2,3));

		String primero[]={"Mensaje", "Confirmar", "Opción", "Entrada"};
		lamina_tipo=new lamina_botones("Tipo", primero);
		
		String segundo[]={"ERROR", "INFORMATION","WARNING", "QUESTION", "PLAIN"};
		lamina_mensajes=new lamina_botones("Tipo de Mensaje", segundo);
		
		String tercero[]={"Cadena", "Icono", "Componente", "Otros", "Object"};
		lamina_mensaje=new lamina_botones("Mensajes", tercero);
		String cuarto[]={"DEFAULT", "YES_NO_", "YES_NO_CANCEL", "OK_CANCEL"};
		lamina_confirmar=new lamina_botones("Confirmar", cuarto);
		
		String quinto[]={"String", "Icon", "Object"};
		lamina_opcion=new lamina_botones("Opción", quinto);
		
		String sexto[]={"Campo de Texto", "Combo"};
		lamina_entrada=new lamina_botones("Entrada", sexto);
		
		setLayout(new BorderLayout());
		
		lamina_cuadricula.add(lamina_tipo);
		lamina_cuadricula.add(lamina_mensajes);
		lamina_cuadricula.add(lamina_mensaje);
		lamina_cuadricula.add(lamina_confirmar);
		lamina_cuadricula.add(lamina_opcion);
		lamina_cuadricula.add(lamina_entrada);
		add(lamina_cuadricula, BorderLayout.CENTER);
		
		JPanel lamina_mostrar=new JPanel();
		JButton Mostrar=new JButton("Mostrar");
		Mostrar.addActionListener(new accion_mostrar());
		
		lamina_mostrar.add(Mostrar);
		add(lamina_mostrar, BorderLayout.SOUTH);
	}	
		
	private String cadenamensaje="Mensaje";
	private Icon iconomensaje=new ImageIcon("src/pruebas/icono.png");
	private Object objetomensaje=new Date();
	private Component compomensaje=new lam_cuadrado();	
	
	
	private class accion_mostrar implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		if(lamina_tipo.dameSeleccion().equals("Mensaje")) {
			JOptionPane.showMessageDialog(marcoption.this, damemensajes(), "Tipo", dameTipo(lamina_mensajes) );
		}else if(lamina_tipo.dameSeleccion().equals("Confirmar")) {
			JOptionPane.showConfirmDialog(marcoption.this, damemensajes(), "Tipo", dameTipo(lamina_confirmar), dameTipo(lamina_mensajes));
		}else if(lamina_tipo.dameSeleccion().equals("Entrada")) {
			JOptionPane.showInputDialog(marcoption.this, damemensajes(), "Tipo", dameTipo(lamina_mensajes));
		}else if(lamina_tipo.dameSeleccion().equals("Opción")) {
			JOptionPane.showOptionDialog(marcoption.this, damemensajes(), "Tipo", 0, dameTipo(lamina_mensajes), null, null, null);
		}
	}
		/////////////DEVUELVE MENSAJE////////////
		
		public Object damemensajes() {
			String s=lamina_mensaje.dameSeleccion();
			
			if(s.equals("Cadena")) {
				return cadenamensaje;
				
			}else if(s.equals("Icono")) {
				return iconomensaje;
				
			}else if(s.equals("Componente")) { 
				return compomensaje;
				
			}else if(s.equals("Otros")) {
				return objetomensaje;
				
			}else if(s.equals("Object")) {
				
				return new Object[] {cadenamensaje,iconomensaje,compomensaje,objetomensaje};
			}else {
				return null;
			}
		}
////////////////////DEVUELVE TIPO ICONO///////////////////
		
			public int dameTipo(lamina_botones lamina) {
			String l=lamina.dameSeleccion();
			
			if(l.equals("ERROR") ||l.equals("YES_NO_")) {
				return 0;
				
			}else if(l.equals("INFORMATION") || l.equals("YES_NO_CANCEL")) {
				return 1;
				
			}else if(l.equals("WARNING") || l.equals("OK_CANCEL")) {
				return 2;
				
			}else if(l.equals("QUESTION")) {
				return 3;
				
			}else if(l.equals("PLAIN") || l.equals("DEFAULT")) {
				return -1;
			}else {
				return (Integer) null;
			}
		}
	}

	class lam_cuadrado extends JPanel{
		
		public void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			
			Graphics2D g2=(Graphics2D) g;
			
			Rectangle2D rectangulo=new Rectangle.Double(0,0, getWidth(), getHeight());
			
			g2.setPaint(Color.YELLOW);
			
			g2.fill(rectangulo);
		}
	}		
}
	

class lamina_botones extends JPanel{
	
	private ButtonGroup grupo;
	
	
	
	public lamina_botones(String titulo, String [] opciones) {
		
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		grupo=new ButtonGroup();
		
		for(int i=0; i<opciones.length; i++) {
			JRadioButton bot=new JRadioButton(opciones[i]);
			bot.setActionCommand(opciones[i]);
			add(bot);
			grupo.add(bot);
			bot.setSelected(i==0);
			
			}
	}
	
	public String dameSeleccion() {
		
		ButtonModel miboton=grupo.getSelection();
		String s=miboton.getActionCommand();
		
		return s;
		}
}
	