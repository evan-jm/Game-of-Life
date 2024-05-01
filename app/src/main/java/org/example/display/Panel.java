package org.example.display;
import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 * Contents portrayed on frame
 */
public class Panel extends JPanel {
    public Panel(int rows, int cols) {
        GridLayout gridLayout = new GridLayout(rows, cols);
        this.setLayout(gridLayout);
    }
}