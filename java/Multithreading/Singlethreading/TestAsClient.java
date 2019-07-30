package Multithreading.Singlethreading;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestAsClient {
    public static void main(String[] args) throws InterruptedException {

        try(Socket socket = new Socket("localhost", 3345);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());	) {
            System.out.println("Client connected to socket");
            System.out.println();
            System.out.println("Client writting chanel  = outputStream & " +
                    "reading chanel = inputStream is initialized");

            while (!socket.isOutputShutdown()) {

                if (br.ready()) {
                    System.out.println("Client start writing in chanel...");
                    Thread.sleep(1000);
                    String clientCommand = br.readLine();

                    outputStream.writeUTF(clientCommand);
                    outputStream.flush();
                    System.out.println("Client sent message " + clientCommand + " to server");
                    Thread.sleep(1000);

                    if (clientCommand.equalsIgnoreCase("quit")) {
                        System.out.println("Client kill connection");
                        Thread.sleep(2000);

                        if (inputStream.read() > -1) {
                            System.out.println("reading...");
                            String in = inputStream.readUTF();
                            System.out.println(in);
                        }
                        break;
                    }
                    System.out.println("Client sent message  & start waiting for data from server...");
                    Thread.sleep(2000);

                    if(inputStream.read() > -1) {
                        System.out.println("reading...");
                        String in = inputStream.readUTF();
                        System.out.println(in);
                    }
                }
            }
            System.out.println("Close connection & chanel on clientSide - DONE");

            }catch (UnknownHostException e){
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
        }

    }
}
