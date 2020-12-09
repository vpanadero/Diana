package graficos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Varios_oyentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marcoestado miventana=new Marcoestado();
		
		miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class Marcoestado extends JFrame{
	
	public Marcoestado() {
		
		setVisible(true);
		
			
		setBounds(700,300,500,300);
		
				
	}
}  


	
