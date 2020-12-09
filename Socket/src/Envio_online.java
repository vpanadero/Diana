import java.awt.event.*;
import java.io.ObjectOutputStream;
import java.net.*;

public class Envio_online extends WindowAdapter {
	
	public void WindowOpened(WindowEvent e) {

		try {
			
			Socket miSocket=new Socket("192.168.1.42", 9999);
			
			PaqueteEnvio datos=new PaqueteEnvio();
			
			datos.setMensaje("Online");
			
			ObjectOutputStream ventanaDatos=new ObjectOutputStream(miSocket.getOutputStream());
			
			ventanaDatos.writeObject(datos);
			
			miSocket.close();
			
			
			
		}catch(Exception e2) {}
			System.out.println("Algo fue mal en el metodo de ventana");
	}
}