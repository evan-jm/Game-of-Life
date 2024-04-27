import display.*;
import main.*;

public class Main {
    public static void main(String[] args) {
        int rows = 10;
        int cols = 10;
        Board board = new Board(rows, cols);
        Frame frame = new Frame(rows, cols, board);
        frame.run();
    }
}