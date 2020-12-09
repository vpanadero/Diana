import javax.swing.*;
public class Acceso_app_bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave="Juan";
		
		String pass="";
		
		while (clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("Introduce la contraseña");
			
			if (clave.equals(pass)==false) {
				
				System.out.println("Contraseña incorrecta, vuelva a intentarlo");
				
			}
		}
		
		System.out.println("Acceso permitido");
		
	}

}
