package client;

import java.net.*;
import java.io.*;
import allfunction.AllFonction;

public class Client{
    public static void main(String[] args) throws IOException{
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        int port = 2804;
        AllFonction fonction = new AllFonction();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("sgbd>");

        String request = in.readLine();
        byte[] req = new byte[request.length()];

        DatagramPacket packet = new DatagramPacket(req, request.length(),ip, port);
        DatagramSocket socket = new DatagramSocket();
        socket.send(packet);
        socket.close();
    }
}
