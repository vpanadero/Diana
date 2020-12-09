package graficos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Cambio_estados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marcoestado miventana=new Marcoestado();
		
		miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class Marcoestado extends JFrame{
	
	public Marcoestado() {
		
		setVisible(true);
		
		setTitle("Cambio de estado");
			
		setBounds(300,300,500,350);
		
		Cambio newState=new Cambio();
		
		addWindowStateListener(newState);
		
		addWindowListener(newState);
	}
}  


class Cambio extends WindowAdapter implements WindowStateListener{
	
public void windowActivated(WindowEvent e) {
		
		System.out.println("Ventana activada");
		
	}
	
	public void windowIconified(WindowEvent e) {
		
		System.out.println("Ventana minimzada");
	}

	
	public void windowStateChanged(WindowEvent e) {
		
		System.out.println("La ventana ha cambiado de estado");
		
		System.out.println(e.getNewState());
		
		if(e.getNewState()==6) {
			
			System.out.println("La ventana esta maximizada");
		}
		
		else if(e.getNewState()==0) {
			
			System.out.println("La ventana esta restaurada");
		}
		
		else {
			
			System.out.println("La ventana esta minimzada");
		}
			
	}
	
	
}
