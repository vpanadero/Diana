import java.util.*;
public class Prueba_linkedList2 {

public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkedList<String> personas=new LinkedList<String>();
	
		personas.add("Jhonny");
		
		personas.add("Ramón");
		
		personas.add("Jose Antonio");
		
		personas.add("Nuria");
		
		personas.add("Silvia");
		
		personas.add("Víctor");
		
		personas.add("Maestre");
		
	System.out.println(personas.size());
		
		for (String persona : personas) {
			
			System.out.println(persona);
		}
	}

}
