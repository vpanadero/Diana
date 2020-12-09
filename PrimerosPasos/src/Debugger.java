import javax.swing.JOptionPane;

public class Debugger {

	public static void main(String[] args) {
		
		int elementos=Integer.parseInt(JOptionPane.showInputDialog("Introduce elementos"));
		
		int numale[]=new int[elementos];
		
		for(int i=0;i<numale.length; i++) {
			
			numale[i]=(int)(Math.random()*100);
		}
		
		for(int elem:numale) {
			
			System.out.println(elem);
		}
	}

}
