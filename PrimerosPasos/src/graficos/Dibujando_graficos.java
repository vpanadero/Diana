package graficos;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;

public class Dibujando_graficos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoDibujo mimarco=new MarcoDibujo();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class MarcoDibujo extends JFrame{
	
	public MarcoDibujo() {
		
		setTitle("Prueba de Dibujo");
		
		setSize(600,600);
		
		Laminafigura milamina=new Laminafigura();
		
		add(milamina);
		
		milamina.setBackground(Color.cyan);
		
		milamina.setForeground(Color.BLUE);
	}
}

class Laminafigura extends JPanel{
	
public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		File troll =new File("src/graficos/troll.png");
		
		
		try {
			imagen=ImageIO.read(troll);
		} catch (IOException e) {
			
			System.out.println("La imagen no se encuentra");
		}
		
		Graphics2D g2=(Graphics2D) g;
		
		g2.drawImage(imagen, 300, 100, null);
		
		Font mifuente =new Font("Pacifico", Font.BOLD, 26);
		
		g2.setFont(mifuente);
		
		g2.setColor(Color.WHITE);
		
		g2.drawString("CURSO", 600, 150);
		
		Rectangle2D rectangulo=new Rectangle2D.Double(100, 100, 200, 150);
		
		g2.setPaint(Color.cyan);
		
		g2.draw(rectangulo);
		
		Ellipse2D elipse=new Ellipse2D.Double();
		
		
		elipse.setFrame(rectangulo);
		
		g2.setPaint(new Color(255,255,0));
		
		g2.fill(elipse);
		
		g2.draw(new Line2D.Double(100,100,300,250));
		
		double CentroenX=rectangulo.getCenterX();
		
		double Centroeny=rectangulo.getCenterY();
		
		double radio=125;
		
		Ellipse2D circulo=new Ellipse2D.Double();
		
		circulo.setFrameFromCenter(CentroenX, Centroeny, CentroenX+radio, Centroeny+radio);
		
		g2.draw(circulo);
		
		
	}

	private Image imagen;
	
}