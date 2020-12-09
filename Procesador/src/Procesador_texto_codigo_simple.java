

import javax.swing.*;
import javax.swing.text.StyledEditorKit;

import java.awt.*;
import java.awt.event.*;

public class Procesador_texto_codigo_simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marcoprocesador elmenu=new Marcoprocesador();
		
		elmenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		elmenu.setVisible(true);
		
		
		
	}

}


class Marcoprocesador extends JFrame{
	
	public Marcoprocesador() {
		
		setTitle("Procesador de Texto");
		setBounds(500,300,550,400);
		Menuprocesador laminamenu=new Menuprocesador();
		add(laminamenu);
	}
}


class Menuprocesador extends JPanel{
	
	//VARIABLES DECLARADAS
	
	JTextPane miarea;
	JMenu fuente,estilo,tamano;
	Font letras;
	
	
	// CONSTRUCTOR---------
	
	public Menuprocesador(){
		
			
		setLayout(new BorderLayout());
		
		JPanel laminamenu=new JPanel();
		
		JMenuBar mibarra =new JMenuBar();
		
		JMenu archivo =new JMenu("Archivo");
		JMenu edicion =new JMenu("Edición");
		JMenu herramientas =new JMenu("Herramientas");
		JMenu opciones=new JMenu("Opciones");
		fuente=new JMenu("Fuente");
		estilo=new JMenu("Estilo");
		tamano=new JMenu("Tamaño");
		
		configura_menu("Arial", "fuente","Arial", 9, 10);
		configura_menu("Courier", "fuente","Courier", 9, 10);
		configura_menu("Verdana", "fuente","Verdana", 9, 10);
		
		configura_menu("Plana", "estilo","", Font.PLAIN, 1);
		configura_menu("Negrita", "estilo","", Font.BOLD, 1);
		configura_menu("Cursiva", "estilo","", Font.ITALIC, 1);
		
		configura_menu("12", "tamaño","", 9, 12);
		configura_menu("16", "tamaño","", 9, 16);
		configura_menu("20", "tamaño","", 9, 20);
		configura_menu("24", "tamaño","", 9, 24);
		
		JMenuItem guardar=new JMenuItem("Guardar");
		JMenuItem guardar_c=new JMenuItem("Guardar como");
		JMenuItem cortar=new JMenuItem("Cortar");
		JMenuItem copiar=new JMenuItem("Copiar");
		JMenuItem pegar=new JMenuItem("Pegar");
				
		JMenuItem generales=new JMenuItem("Generales");
		
		JMenuItem opcion1 =new JMenuItem("Opcion1");
		JMenuItem opcion2 =new JMenuItem("Opcion2");
	
		
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
		
		//------------------------------------------
		//POPUP MENU BOTON DERECHO DE RATON
		//------------------------------------------
		
		JPopupMenu menupop=new JPopupMenu();
		
		JMenuItem negritapop=new JMenuItem("Negrita");
		JMenuItem cursivapop=new JMenuItem("Cursiva");
		
		negritapop.addActionListener(new StyledEditorKit.BoldAction());
		cursivapop.addActionListener(new StyledEditorKit.ItalicAction());
		
		menupop.add(negritapop);
		menupop.add(cursivapop);
		
		
		
		
		//-------------------------------------------
		
		laminamenu.add(mibarra);
		
		add(mibarra, BorderLayout.NORTH);		
				
		miarea=new JTextPane();
		add(miarea, BorderLayout.CENTER);
		
		miarea.setComponentPopupMenu(menupop);
				
		//-------------------------------------------
		//JTOOLBAR DE BARRA DE HERRAMIENTAS
		//-------------------------------------------
				
		JToolBar barra=new JToolBar();
				
		JButton negritabar=new JButton(new ImageIcon("bin/graficos/negrita.png"));
		JButton cursivabar=new JButton(new ImageIcon("bin/graficos/cursiva.png"));
		JButton subrayabar=new JButton(new ImageIcon("bin/graficos/subrayado.png"));
				
		negritabar.addActionListener(new StyledEditorKit.BoldAction());
		cursivabar.addActionListener(new StyledEditorKit.ItalicAction());
		subrayabar.addActionListener(new StyledEditorKit.UnderlineAction());

		barra.add(negritabar);
		barra.add(cursivabar);
		barra.add(subrayabar);
		
		barra.setOrientation(1);
		
		add(barra, BorderLayout.WEST);
		
		
	}
	
	
	public void configura_menu(String rotulo, String menu, String tipo_letra, int estilos, int tam) {
		
		JMenuItem elem_menu=new JMenuItem(rotulo);
		
		if (menu=="fuente") {
			fuente.add(elem_menu);
			
		}else if(menu=="estilo"){
			estilo.add(elem_menu);
					
		}else if(menu=="tamaño"){
			tamano.add(elem_menu);
			
		}
		
		elem_menu.addActionListener(new gestiona_eventos(rotulo, tipo_letra, estilos,tam));
	}
	
	private class gestiona_eventos implements ActionListener{
		
		//VARIABLES DECLARADAS
		
		String tipo_texto, menu;
		
		int estilo, tamano_letra;
		
		//CONSTRUCTOR

		gestiona_eventos(String elemento, String texto2, int estilo2, int tam_letra) {
			
			tipo_texto=texto2;
			
			estilo=estilo2;
			tamano_letra=tam_letra;
			menu=elemento;
		}
		//LISTENER
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			letras=miarea.getFont();
			
			if(menu=="Arial" || menu=="Courier" || menu=="Verdana"){
				
				estilo=letras.getStyle();
				tamano_letra=letras.getSize();
			}else if(menu=="Plana" || menu=="Cursiva" || menu=="Negrita") {
				
				tipo_texto=letras.getFontName();
				tamano_letra=letras.getSize();			
				
			}else if(menu=="12" || menu=="16" || menu=="20" || menu=="24") {
				
				estilo=letras.getStyle();
				tipo_texto=letras.getFontName();
				
				
			}
					
			
			miarea.setFont(new Font(tipo_texto, estilo, tamano_letra));
		}
		
		
	}
}
	

		