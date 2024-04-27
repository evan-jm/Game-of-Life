package display;
import main.Board;
import java.awt.GridLayout;
import javax.swing.JFrame;

/**
 * Generates frame and contents for GUI
 */
public class Frame extends JFrame {
    public Frame(int rows, int cols, Board board) {
        this.setTitle("Game of Life");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 800);
        this.setLayout(new GridLayout(1, 0));
        this.add(new submitPanel(board));
        this.add(new buttonPanel(rows, cols, board));
    }

    public void run() {
        this.setVisible(true);
    }
}