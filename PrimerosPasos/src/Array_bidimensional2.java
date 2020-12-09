
public class Array_bidimensional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [][] matrix= {
				{15,21,18,9,15},
				{5,25,37,41,25},
				{7,18,32,14,90},
				{58,26,57,2,14}
				};
		
		
		for (int[]fila:matrix) {
			
			System.out.println();
			
			for (int z:fila) {
				
				System.out.print(z + " ");
			
			}
			
		}
	}

}
