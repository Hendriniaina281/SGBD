package server;

import java.io.IOException;
import java.net.*;

public class Server{
    public static void main(String[] args) throws SocketException,IOException{
        int port = 2804;
        byte[] buffer = new byte[4365];
        DatagramPacket paquet = new DatagramPacket(buffer,buffer.length);
        DatagramSocket socket = new DatagramSocket(port);
        
        while(true){
            socket.receive(paquet);
            //String s = new String(paquet);
            System.out.println("paquet anao: "+paquet);
        }
    }

}