package HeadFist.Serialization;

import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile {
    public static void main(String[] args) {
        try{
            FileWriter fileWriter = new FileWriter("log.txt");
            fileWriter.write("Hello World!");
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
