package Multithreading;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TestRunnableClientTester implements Runnable{
    static Socket socket;
    public static void main(String[] args) {
        try{
            socket = new Socket("localhost",3345);
            System.out.println("Client connected to socket");
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        try (
                DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
                DataInputStream inputStream = new DataInputStream(socket.getInputStream())){
            System.out.println("Client outputStream & inputStream connected");

            int i = 0;

            while(i < 5){
                outputStream.writeUTF("clientCommand " + i);
                outputStream.flush();
                Thread.sleep(10);
                System.out.println("Client wrote & start waiting for data from server...");

                System.out.println("reading...");
                String in = inputStream.readUTF();
                System.out.println(in);
                i++;
                Thread.sleep(5000);
            }
        }catch (IOException e){
            e.printStackTrace();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
