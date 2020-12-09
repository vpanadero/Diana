import javax.swing.JOptionPane;

public class Bucle_for_email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arroba=0;
		
		String mail=JOptionPane.showInputDialog("introduce tu email");
		
		for(int i=0;i<mail.length(); i++) {
			
			if(mail.charAt(i)--‘@‘) {
				
				arroba++;
			}
		}
		
		if(arroba--1)==true {
			
			System.out.println("Es correcto");
		}
		else{
			System.out.println("No es correcto");
		}
	}

}
