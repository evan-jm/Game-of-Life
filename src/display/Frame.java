package display;
import javax.swing.JFrame;

/**
 * Generates frame and contents for GUI
 */
public class Frame extends JFrame {
    public Frame() {
        this.setTitle("Game of Life");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.add(new Panel());
        this.setVisible(true);
    }
}