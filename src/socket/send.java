package socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
/**
 *
 * @author Kaat
 */
public class send {
   
    public static void main(String args[]){
        if (args.length!=3){
            System.out.println("Se requieren 3 argumentos");
        }
        else{
            try{
             InetAddress receptor=InetAddress.getByName(args[0]);
             int puerto=Integer.parseInt(args[1]);
             String mensaje=args[2];
             DatagramSocket Socket=new DatagramSocket();
             
             byte [] almacen=mensaje.getBytes();
             DatagramPacket paquete=new DatagramPacket(almacen, almacen.length, receptor, puerto);
             Socket.send(paquete);
             Socket.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    } 
}
