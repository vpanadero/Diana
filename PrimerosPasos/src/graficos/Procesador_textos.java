package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Procesador_textos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Menuframe mimenu=new Menuframe();
		
		mimenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimenu.setVisible(true);
		
		
		
	}

}


class Menuframe extends JFrame{
	
	public Menuframe() {
		
		setTitle("Menus");
		setBounds(500,300,550,400);
		Menulamina laminamenu=new Menulamina();
		add(laminamenu);
	}
}

class Menulamina extends JPanel{
	
	//VARIABLES DECLARADAS
	
	JTextPane miarea;
	
	
	
	// CONSTRUCTOR---------
	
	public Menulamina(){
		
			
		setLayout(new BorderLayout());
		
		JPanel laminamenu=new JPanel();
		
		JMenuBar mibarra =new JMenuBar();
		
		JMenu archivo =new JMenu("Archivo");
		JMenu edicion =new JMenu("Edición");
		JMenu herramientas =new JMenu("Herramientas");
		JMenu opciones=new JMenu("Opciones");
		JMenu fuente=new JMenu("Fuente");
		JMenu estilo=new JMenu("Estilo");
		JMenu tamano=new JMenu("Tamaño");
		
		
		JMenuItem guardar=new JMenuItem("Guardar");
		JMenuItem guardar_c=new JMenuItem("Guardar como");
		JMenuItem cortar=new JMenuItem("Cortar");
		JMenuItem copiar=new JMenuItem("Copiar");
		JMenuItem pegar=new JMenuItem("Pegar");
				
		JMenuItem generales=new JMenuItem("Generales");
		
		JMenuItem opcion1 =new JMenuItem("Opcion1");
		JMenuItem opcion2 =new JMenuItem("Opcion2");
		
		JMenuItem arial =new JMenuItem("Arial");
		JMenuItem courier=new JMenuItem("Courier");
		courier.addActionListener(new Gestion_menu());
		
		JMenuItem verdana =new JMenuItem("Verdana");
		
		JMenuItem negrita=new JMenuItem("Negrita");
		JMenuItem cursiva =new JMenuItem("Cursiva");		

		JMenuItem tam12=new JMenuItem("12");
		JMenuItem tam16 =new JMenuItem("16");
		JMenuItem tam20=new JMenuItem("20");
		JMenuItem tam24 =new JMenuItem("24");
		
		//-------------------------------------------
		
		
		mibarra.add(archivo);
		mibarra.add(edicion);
		mibarra.add(herramientas);
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamano);
		
		archivo.add(guardar);
		archivo.add(guardar_c);
		
		edicion.add(cortar);
		edicion.add(copiar);
		edicion.add(pegar);
		
		edicion.addSeparator();
		
		opciones.add(opcion1);
		opciones.add(opcion2);
		
		edicion.add(opciones);
		
		herramientas.add(generales);
		
		fuente.add(arial);
		fuente.add(courier);
		fuente.add(verdana);
		
		estilo.add(negrita);
		estilo.add(cursiva);
		
		tamano.add(tam12);
		tamano.add(tam16);
		tamano.add(tam20);
		tamano.add(tam24);
		
		//-------------------------------------------
		
		laminamenu.add(mibarra);
		
		add(mibarra, BorderLayout.NORTH);		
		
		miarea=new JTextPane();
		add(miarea, BorderLayout.CENTER);
		
	}
	
	private class Gestion_menu implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			miarea.setFont(new Font("Courier", Font.PLAIN, 12));
		}
		
		
	}
	
}
		