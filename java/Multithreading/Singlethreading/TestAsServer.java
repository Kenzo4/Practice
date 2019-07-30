package Multithreading.Singlethreading;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TestAsServer{
    public static void main(String[] args) throws InterruptedException {
        try(ServerSocket server = new ServerSocket(3345)){

            Socket client = server.accept();
            System.out.println("Connection accepted");

            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            System.out.println("DataOutputStream created");

            DataInputStream in = new DataInputStream(client.getInputStream());
            System.out.println("DataInputStream created");

            while(!client.isClosed()){
                System.out.println("Server reading from channel");

                String entry = in.readUTF();

                System.out.println("Read from client message " + entry);

                System.out.println("Server try writing to chanel");

                if(entry.equalsIgnoreCase("quit")){
                    System.out.println("Client initialize connection is suicide...");
                    out.writeUTF("Server reply " + entry + " - OK");
                    out.flush();
                    Thread.sleep(3000);
                    break;
                }

                out.writeUTF("Server reply " + entry + " - OK");
                System.out.println("Server wrote message to client");

                out.flush();
            }
            System.out.println("Client disconnected");
            System.out.println("Closing connection & chanel");

            in.close();
            out.close();

            client.close();

            System.out.println("Closing connection & chanels  - DONE!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}