package HeadFist.Puzzle.Chapter11;

public class MyEx extends Exception {
    public MyEx() {
    }

    public MyEx(String message) {
        super(message);
    }

    public MyEx(String message, Throwable cause) {
        super(message, cause);
    }

    public MyEx(Throwable cause) {
        super(cause);
    }
}
