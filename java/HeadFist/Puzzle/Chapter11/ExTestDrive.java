package HeadFist.Puzzle.Chapter11;

public class ExTestDrive {

    static void doRisky(String t) throws MyEx {
        System.out.print("h");
        if ("yes".equals(t)) {
            System.out.print("a");
            throw new MyEx();
        }
        System.out.print("r");
        System.out.print("o");
    }

    public static void main(String[] args) {
       // String test = args[0];
        System.out.print("t");
        try {
            doRisky("yes");
        } catch (MyEx e) {
        }finally {
            System.out.print("w");
            System.out.print("s");
        }
    }
}
