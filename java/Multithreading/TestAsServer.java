package Multithreading;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestAsServer {
    public static void main(String[] args) throws InterruptedException{
        try(ServerSocket server = new ServerSocket(3345)){

            Socket client = server.accept();

            System.out.println("Connection accepted");

            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            System.out.println("DataOutputStream created");

            DataInputStream in = new DataInputStream(client.getInputStream());

            while(!client.isClosed()){
                System.out.println("Server reading from chanel");

                String entry = in.readUTF();

                System.out.println("Read from client message" + entry);
                System.out.println("Server try writing to chanel");
            }
        }
    }
}
