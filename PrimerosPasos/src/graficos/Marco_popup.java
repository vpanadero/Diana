package graficos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Marco_popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marcopop ventanapop=new Marcopop();
		
		ventanapop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class Marcopop extends JFrame{
	
	public Marcopop() {
		
		laminaemergente laminapop=new laminaemergente();
					
		setBounds(100,100,300,250);
		
		setVisible(true);	
		
		add(laminapop);
	}
}  

class laminaemergente extends JPanel{
	
	public laminaemergente() {
		
		JPopupMenu menupop=new JPopupMenu();
		
		JMenuItem op1=new JMenuItem("Opcion 1");
		JMenuItem op2=new JMenuItem("Opcion 2");
		JMenuItem op3=new JMenuItem("Opcion 3");
		
		menupop.add(op1);
		menupop.add(op2);
		menupop.add(op3);
		
		
		setComponentPopupMenu(menupop);
		
	}
}
	
