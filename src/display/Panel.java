package display;
import javax.swing.JPanel;
import java.awt.GridLayout;

/**
 * Contents portrayed on frame
 */
public class Panel extends JPanel {
    public Panel() {
        this.setLayout(new GridLayout(10, 10));
    }
}