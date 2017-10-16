/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author Kaat
 */
public class receive {
    
    public static void main(String args[]){
        if(args.length!=3){
            System.out.println("Se requieren 3 argumentos");
        }
        else{
            int puerto=Integer.parseInt(args[0]);
            final int maximaLong=10;
            try{
                DatagramSocket Socket=new DatagramSocket();
                byte[] almacen=new byte[maximaLong];
                DatagramPacket paquete=new DatagramPacket(almacen, maximaLong);
                Socket.receive(paquete);
                String mensaje=new String(almacen);
                System.out.println(mensaje);
                Socket.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
