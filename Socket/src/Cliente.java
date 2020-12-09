import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;
import javax.swing.*;
import java.util.*;


public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCliente mimarco=new MarcoCliente();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoCliente extends JFrame{
	
	public MarcoCliente(){
		
		setBounds(600,300,360,350);
				
		LaminaMarcoCliente milamina=new LaminaMarcoCliente();
		
		add(milamina);
		
		setVisible(true);
		
		addWindowListener(new Envio_online());
		}	
	
}

class LaminaMarcoCliente extends JPanel implements Runnable{
	
	
	private JTextField campo1;
	
	private JComboBox ip;

	private JButton miboton;
	
	private JTextArea chat;
	
	private JLabel miNick, nick;
	
	public LaminaMarcoCliente(){
		
		String nickUsuario=JOptionPane.showInputDialog("Introduce tu nick: ");
		
		miNick=new JLabel("Nick: ");
		
		add(miNick);
	
		nick=new JLabel();
		
		nick.setText(nickUsuario);
		
		add(nick);
		
		JLabel texto=new JLabel("Online");
		
		add(texto);
		
		ip=new JComboBox();
		
			//ip.addItem("192.168.1.42");
			
			//ip.addItem("192.168.1.30");
			
			//ip.addItem("192.168.1.74");
				
		
		add(ip);
		
		chat=new JTextArea(12,25);
		
		add(chat);
			
		campo1=new JTextField(20);
	
		add(campo1);		
	
		miboton=new JButton("Enviar");
		
		enviaTexto evento=new enviaTexto();
		
		miboton.addActionListener(evento);
		
		add(miboton);
		
		Thread hiloEscucha=new Thread(this);
		
		hiloEscucha.start();
		
	}
	
	private class enviaTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			chat.append("\n " + campo1.getText());
			
			try {
				Socket puente=new Socket("192.168.1.42", 9999);
				
				PaqueteEnvio datos=new PaqueteEnvio();
										
				datos.setNick(nick.getText());
				
				datos.setIp(ip.getSelectedItem().toString());
				
				datos.setMensaje(campo1.getText());
				
				ObjectOutputStream paqueteDatos=new ObjectOutputStream(puente.getOutputStream());
				
				paqueteDatos.writeObject(datos);
				
				puente.close();				
				
							
				//DataOutputStream flujoSalida=new DataOutputStream(puente.getOutputStream());
			
				//flujoSalida.writeUTF(campo1.getText());
			
				//flujoSalida.close();
								
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage());
			}
			
		}
		
		
	}

	@Override
	public void run() {
		try {
			ServerSocket servidor2=new ServerSocket(9090);
			
			Socket cliente;
			
			PaqueteEnvio paqueteRecibido;
			
			while(true) {
				
				cliente=servidor2.accept();
				
				ObjectInputStream flujoEntrada=new ObjectInputStream(cliente.getInputStream());
				
				paqueteRecibido=(PaqueteEnvio) flujoEntrada.readObject();
				
				if(!paqueteRecibido.getMensaje().equals("Online")) {
					
					chat.append("\n" + paqueteRecibido.getNick() + " : " + paqueteRecibido.getMensaje());
					
				}else {
					
					ArrayList<String> IpsMenu=new ArrayList<String>();
					
					IpsMenu=paqueteRecibido.getIps();
					
					ip.removeAllItems();
					
					for (String z : IpsMenu) {
						
						ip.addItem(z);						
					}
				}
				
				
			}
			
		}catch(Exception e) {
			
			System.out.println("Algo fue mal");
		
		}
		
	}
		
}