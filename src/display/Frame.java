package display;
import javax.swing.JFrame;

/**
 * Generates frame and contents for GUI
 */
public class Frame extends JFrame {
    public Frame(int rows, int cols) {
        this.setTitle("Game of Life");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 800);
        this.add(new Panel(rows, cols));
    }

    public void run() {
        this.setVisible(true);
    }
}