package display;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;

/**
 * Contents portrayed on frame
 */
public class Panel extends JPanel {
    public Panel(int rows, int cols) {
        this.setLayout(new GridLayout(rows, cols));
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                this.add(new JButton(i + ", " + j));
            }
        }
    }
}