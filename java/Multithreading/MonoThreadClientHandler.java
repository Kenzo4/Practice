package Multithreading;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class MonoThreadClientHandler implements Runnable {

    private static Socket clientDialog;

    public MonoThreadClientHandler(Socket socket){
        MonoThreadClientHandler.clientDialog = socket;
    }

    @Override
    public void run() {
        try{
            DataOutputStream outputStream = new DataOutputStream(clientDialog.getOutputStream());
            DataInputStream inputStream = new DataInputStream(clientDialog.getInputStream());

            System.out.println("DataInputStream created");
            System.out.println("DataOutputStream created");

            while(!clientDialog.isClosed()){
                System.out.println("Server reading from chanel");

                String entry = inputStream.readUTF();

                System.out.println("Read from clientDialog message - " + entry);

                if(entry.equalsIgnoreCase("quit")) {
                    System.out.println("Client close connection");
                    outputStream.writeUTF("Server reply: " + entry + " - OK");
                    Thread.sleep(3000);
                    break;
                }
                System.out.println("Server try writing to chanel");
                outputStream.writeUTF("Server reply: " + entry + " - OK");
                System.out.println("Server wrote message to clientDialog");

                outputStream.flush();
            }

            System.out.println("Client disconnected");
            System.out.println("Closing connections & channels.");

            inputStream.close();;
            outputStream.close();

            clientDialog.close();

            System.out.println("Closing connections & channels - DONE.");
        }catch (IOException e){
            e.printStackTrace();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
