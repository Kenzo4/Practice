package HeadFist.Puzzle.Chapter14;

import java.io.*;

public class DungeonTest {
    public static void main(String[] args) {
        DungeonGame dungeonGame = new DungeonGame();
        try{
            FileOutputStream fos = new FileOutputStream("dg.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dungeonGame);
            oos.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(dungeonGame.getX() + dungeonGame.getY() + dungeonGame.getZ());

        try{
            FileInputStream fis = new FileInputStream("dg.bin");
            ObjectInputStream ois =  new ObjectInputStream(fis);
            dungeonGame = (DungeonGame) ois.readObject();
            System.out.println(dungeonGame.getX() + dungeonGame.getY() + dungeonGame.getZ());
            ois.close();
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
