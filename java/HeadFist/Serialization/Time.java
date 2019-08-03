package HeadFist.Serialization;

import java.io.*;
import java.util.Calendar;
import java.util.Date;

public class Time {
    private Date currentTime = Calendar.getInstance().getTime();

    public Date getCurrentTime() {
        return currentTime;
    }

    public void serialization(){
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("save.bin"));
            objectOutputStream.writeObject(currentTime);
            objectOutputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void deserialization(){
        try{
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("save.bin"));
            Date prevTime = (Date) objectInputStream.readObject();
            System.out.println("Previous time serialization: " + prevTime);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Time currentTime = new Time();
        currentTime.getCurrentTime();
        //currentTime.serialization();
        currentTime.deserialization();
        System.out.println(currentTime.getCurrentTime());
    }
}
