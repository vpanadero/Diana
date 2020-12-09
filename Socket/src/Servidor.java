import javax.swing.*;

import java.awt.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Servidor  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoServidor mimarco=new MarcoServidor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}	
}

class MarcoServidor extends JFrame implements Runnable{
	
	private	JTextArea areaTexto;
	
	public MarcoServidor(){
		
		setBounds(1200,300,280,350);
		
		setTitle("Servidor de Chat");
			
		JPanel milamina= new JPanel();
		
		milamina.setLayout(new BorderLayout());
		
		areaTexto=new JTextArea();
		
		milamina.add(areaTexto,BorderLayout.CENTER);
		
		add(milamina);
		
		setVisible(true);
		
		Thread hilo=new Thread(this);
		
		hilo.start();
		
					
	}

	@Override
	public void run() {
		
		//System.out.println("Funciona");
				
		try {
				
			ServerSocket servidor=new ServerSocket(9999);
			
			String nick, ip, mensaje;
			
			ArrayList<String>listaIP=new ArrayList<String>();
			
			PaqueteEnvio paqueteRecibido;
						
			while(true) {
				
				Socket miSocket=servidor.accept();
				
				ObjectInputStream paqueteDatos=new ObjectInputStream(miSocket.getInputStream());
				
				paqueteRecibido=(PaqueteEnvio) paqueteDatos.readObject();
				
				nick=paqueteRecibido.getNick();
				
				ip=paqueteRecibido.getIp();
				
				mensaje=paqueteRecibido.getMensaje();
				
				if(!mensaje.equals("Online")) {
				
					areaTexto.append("\n" + nick + ": " + mensaje + " para " + ip);
					
					Socket destino=new Socket(ip, 9090);
					
					ObjectOutputStream paqueteReenvio=new ObjectOutputStream(destino.getOutputStream());
					
					paqueteReenvio.writeObject(paqueteRecibido);
					
					paqueteReenvio.close();
					
					destino.close();
					
					
					//DataInputStream recepcion=new DataInputStream(miSocket.getInputStream());
					
					//String recibeTexto=recepcion.readUTF();
					
					//areaTexto.append("\n" + recibeTexto);
					
					miSocket.close();
				
				}else {
					InetAddress localizacion=miSocket.getInetAddress();
					
					String IPRemota=localizacion.getHostAddress();
					
					System.out.println("Online " + IPRemota);
					
					listaIP.add(IPRemota);
					
					for (String ipList : listaIP) {
						
						System.out.println("Array " + ipList);
						
					}
				
				}
			}
		}
			
		 catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	
		

