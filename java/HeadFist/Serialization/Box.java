package HeadFist.Serialization;

import java.io.*;

public class Box implements Serializable {
    private int width;
    private int height;

    public void setWidth(int w){
        width = w;
    }
    public void setHeight(int h){
        height = h;
    }

    public static void serialization(Object object){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("save.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(object);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Box deserialization(File file){
        Box box = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object obj = objectInputStream.readObject();
            box = (Box) obj;
            System.out.println(box.height);
            System.out.println(box.width);
            objectInputStream.close();
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return box;
    }
    public static void main(String[] args){
        /*Box myBox = new Box();
        myBox.setHeight(50);
        myBox.setWidth(30);
        serialization(myBox);*/
        deserialization(new File("Serialize/save.bin"));
    }

}
