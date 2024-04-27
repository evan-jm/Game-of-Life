package display;
import main.Board;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Contents portrayed on frame
 */
public class buttonPanel extends JPanel {
    public buttonPanel(int rows, int cols, Board board) {
        this.setLayout(new GridLayout(rows, cols));
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                final int iCoord = i;
                final int jCoord = j;
                JButton btn = new JButton("(" + i + "," + j + ")");
                btn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        board.add(iCoord, jCoord);
                        btn.setBackground(Color.black);
                    }
                });
                this.add(btn);
            }
        }
    }
}