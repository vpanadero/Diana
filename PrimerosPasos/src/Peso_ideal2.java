import javax.swing.*;
public class Peso_ideal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String genero="";
		
					
			
		while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false) {
		
			genero=JOptionPane.showInputDialog("Introduce tu género (H/M)");
			
			if(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false)
			System.out.println("Introduce H o M ");
		}
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
		
		int pesoideal=0;
		
		if (genero.equalsIgnoreCase("H")) {
			pesoideal=altura-110;
		}
		else if(genero.equalsIgnoreCase("M")){
			pesoideal=altura-120;
			}
		
		System.out.println("Tu peso ideal es " + pesoideal);
	}

}
