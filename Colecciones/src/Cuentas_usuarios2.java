import java.util.*;

public class Cuentas_usuarios2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cl1=new Cliente("Antonio Banderas", "00001", 200000);
		
		Cliente cl2=new Cliente("Rafael Nadal", "00002", 250000);
		
		Cliente cl3=new Cliente("Penélope Cruz", "00003", 3500000);
		
		Cliente cl4=new Cliente("Julio Iglesias", "00004", 7500000);
		
		Set <Cliente> clientesBancos=new HashSet<Cliente>(); 
		
			clientesBancos.add(cl1);
			clientesBancos.add(cl2);
			clientesBancos.add(cl3);
			clientesBancos.add(cl4);
		
		
			
		Iterator<Cliente> it=clientesBancos.iterator();
		
		while(it.hasNext()) {
			
			String nombreCliente=it.next().getNombre();
			
			if(nombreCliente.equals("Julio Iglesias")) {
				
				it.remove();
			}
		}
		
		for (Cliente cliente : clientesBancos) {
		
			System.out.println(cliente.getNombre() + " " + cliente.getnCuenta() + " " + cliente.getSaldo());			
		}
	}

}
