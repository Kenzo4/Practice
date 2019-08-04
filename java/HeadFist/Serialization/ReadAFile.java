package HeadFist.Serialization;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadAFile {
    public static void main(String[] args) {
        try {
            File file = new File("file.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = null;

            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
